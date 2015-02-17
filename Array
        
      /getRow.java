/* Given an index k, return the kth row of the Pascal's triangle.
 * For example, given k = 3,
 * Return [1,3,3,1].
 */
 
public class Solution {
  public List<Integer> getRow(int rowIndex) {
    List<Integer> res = new ArrayList<Integer>();
    
    res.add(1);
    for (int i = 1; i < rowIndex; i++) {
      for (int j = i; j > 0; j--) {
        if (j == i) {
          res.add(i);
          continue;
        }
        res.set(j, res.get(j - 1) + res.get(j));
      }
    }
    
    return res;
  }
}

