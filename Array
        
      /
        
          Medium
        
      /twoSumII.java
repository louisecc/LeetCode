/* 
 *Similar to Question [1. Two Sum], except that the input array is already sorted in ascending order.
 */
 
public class Solution {
  // Two Pointers
  public int[] twoSumII(int[] numbers, int target) {
    int i = 0, j = numbers.length -1;
    
    while (i < j) {
      int sum = numbers[i] + numbers[j];
      if (sum < target) {
        i++;
      } else if (sum > target) {
        j--;
      } else {
        return new int[] {i + 1, j + 1};
      }
    }
    
    throw new IllegalArgumentException("No two sum solution");
  }
}
