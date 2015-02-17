/* Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * For example,
 * There is one obstacle in the middle of a 3x3 grid as illustrated below.
 * [
 *  [0,0,0],
 *  [0,1,0],
 *  [0,0,0]
 * ]
 * The total number of unique paths is 2.
 */
 
public class Solution {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
      return 0;
    }
    
    int m = obstacleGrid.length, n = obstacleGrid[0].length;
    int[][] res = new inr[m][n];
    
    for (int i = 0; i < m; i++) {
      if (obstacleGrid[i][0] != 1) {
        res[i][0] = 1;
      } else {
        break;
      }
    }
    
    for (int j = 0; j < n; j++) {
      if (obstacleGrid[0][j] != 1) {
        res[0][j] = 1;
      } else {
        break;
      }
    }
    
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (obstacleGrid[i][j] != 1) {
          res[i][j] = res[i][j - 1] + res[i - 1][j];
        } else {
          res[i][j] = 0;
        }
      }
    }
    
    return res[m - 1][n - 1];
  }
}
