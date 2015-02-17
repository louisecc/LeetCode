/* A robot is located at the top-left corner of a m x n grid.
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid.
 * How many possible unique paths are there?
 */
 
public class Solution {
  public int uniquePaths(int m, int n) {
    int[] res = new int[n];
    Arrays.fill(res, 1);
    
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        res[j] += res[j - 1];
      }
    }
    
    return res[n - 1];
  }
}
