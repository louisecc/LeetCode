/* Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
 
public class Solution {
  public int majorityElement(int[] num) {
    int majorityIndex = 0, majorityCount = 0;
    
    for (int i = 1; i < num.length; i++) {
      if (num[majorityIndex] == num[i]) {
        majorityCount++;
      } else {
        majorityCount--;
      }
      if (majorityCount == 0) {
        majorityIndex = i;
        majorityCount = 1;
      }
    }
    
    return num[majorityIndex];
  }
}
