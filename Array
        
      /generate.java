/* Given numRows, generate the first numRows of Pascal's triangle.
 * For example, given numRows = 5,
 * Return
 * [
 *     [1],
 *    [1,1],
 *   [1,2,1],
 *  [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */

public class Solution {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();
    
    for (int i = 0; i < numRows; i++) {
      List<Integer> list = new ArrayList<Integer>();
      for (int j = 0; j < i + 1; j++) {
        if (j == 0 || j == i) {
          list.add(1);
          continue;
        }
        list.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
      }
      res.add(list);
    }
    
    return res;
  }
}
