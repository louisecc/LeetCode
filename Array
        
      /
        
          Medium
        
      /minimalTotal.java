/* 
 * Given a triangle, find the minimum path sum from top to bottom.
 * Each step you may move to adjacent numbers on the row below.
 * For example, given the following triangle
 * [
 *     [2],
 *    [3,4],
 *   [6,5,7],
 *  [4,1,8,3]
 * ]
 * The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11). 
 */
 
public class Solution {
  public int minimalTotal(List<List<Integer>> triangle) {
    int n = triagle.sixe();
    int[] sum = new int[n + 1];
    
    for (int i = n - 1; i >= 0; i--) {
      List<Integer> list = triangle.get(i);
      for (int j = 0; j < list.size(); j++) {
        sum[j] = Math.min(sum[j], sum[j + 1]) + list.get(j);
      }
    }
    
    return sum[0];
  }
}
