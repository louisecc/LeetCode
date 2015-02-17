/* 
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * For example,
 * Given the following matrix:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
 * You should return [1,2,3,6,9,8,7,4,5]. 
 */
 
public class Solution {
  public int[][] generateMatrix(int n) {
    int[][] matrix = new int[n][n];
    int num = 1;
    
    for (int i = 0; i <= (n - 1) / 2; i++) {
      int dist = n - i * 2;
      if (dist == 1) {
        matrix[i][i] = num;
        break;
      }
      
      for (int j = i; j < i + dist - 1; j++) {
        matrix[i][j] = num++;
      }
      for (int j = i; j < i + dist - 1; j++) {
        matrix[j][i + dist - 1] = num++;
      }
      for (int j = i + dist - 1; j > i; j--) {
        matrix[i + dist - 1][j] = num++;
      }
      for (int j = i + dist - 1; j > i; j--) {
        matrix[j][i] = num++;
      }
    }
    
    return matrix;
  }
}
