/* 
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively. 
 */
 
public class Solution {
  public void sortColors(int[] A) {
    if (A == null || A.length <= 1) {
      return;
    }
    
    int red = 0, blue = A.length - 1;
    int i = 0;
    
    while (i < blue) {
      if (A[i] == 0) {
        swap(A, red, i);
        red++;
        i++;
      } else if (A[i] == 1) {
        i++;
      } else {
        swap(A, blue, i);
        blue--;
      }
    }
  }
  
  private void swap(int[] arr, int i, int j) {
    int tmp = arr[i];
    arr[i] = arr[j];
    arr[j] = tmp;
  }
}
