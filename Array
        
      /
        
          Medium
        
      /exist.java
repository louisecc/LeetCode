/* Given a 2D board and a word, find if the word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring.
 * The same letter cell may not be used more than once.
 * 
 * For example,
 * Given board =
 * [
 *  ["ABCE"],
 *  ["SFCS"],
 *  ["ADEE"]
 * ]
 * word = "ABCCED", -> returns true,
 * word = "SEE", -> returns true,
 * word = "ABCB", -> returns false.
 */
 
public class Solution {
  public boolean exist(char[][] board, String word) {
    if (board == null || board.length == 0 || board[0].length == 0) {
      return false;
    }
    if (word == null || word.length() == 0) {
      return true;
    }
    
    int m = board.length, n = board[0].length;
    if (m * n < word.length()) {
      return false;
    }
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == word.charAt(0)) {
          boolean found = search(board, i, j, word, 0);
          if (found) {
            return true;
          }
        }
      }
    }
    
    return false;
  }
  
  private boolean search(char[][] board, int i, int j, String word, int pos) {
    if (pos == word.length())  {
      return true;
    }
    
    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(pos)) {
      return false;
    }
    
    board[i][j] = '#';
    boolean found = search(board, i - 1, j, word, pos + 1) || search(board, i, j - 1, word, pos + 1) || search(board, i + 1, j, word, pos + 1) || search(board, i, j + 1, word, pos + 1);
    board[i][j] = word.charAt(pos);
    return res;
  }
}
