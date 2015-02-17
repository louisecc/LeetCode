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
  public List<Integer> spiralOrder(int[][] matrix) {
    List<Integer> res = new ArrayList<Integer>();
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return res;
    }
    
    int m = matrix.length, n = matrix[0].length;
    
    for (int i = 0; i <= Math.min(m, n) / 2; i++) {
      int h = m - i * 2;
      int w = n - i * 2;
      
      if (h == 1) {
        for (int j = i; j < i + w; j++) {
          res.add(matrix[i][j]);
        }
        break;
      }
      if (w == 1) {
        for (int j = i; j < i + h; j++) {
          res.add(matrix[i][j];
        }
        break;
      }
      
      for (int j = 1; j <= i + w; j++) {
        res.add(matrix[i][j]);
      }
      for (int j = i; j <= i + h; j++) {
        res.add(matrix[j][i + w - 1]);
      }
      for (int j = i + w - 1; j > i; j--) {
        res.add(matrix[i + h - 1][j];
      }
      for (int j = i + h - 1; j > i; j--) {
        res.add(matrix[j][i]);
      }
    }
    
    return res;
  }
}
