/*
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Here are few examples.
 * [1,3,5,6], 5 → 2
 * [1,3,5,6], 2 → 1
 * [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0 
 */
 
public class Solution {
  public int searchInsert(int[] A, int target) {
    int left = 0, right = A.length - 1;
    int mid;
    
    if (target < A[0]) {
      return 0;
    }
    
    while (left + 1 < right) {
      mid = left + (right - left) / 2;
      if (A[mid] < target) {
        left = mid;
      } else if (A[mid] > target) {
        right = mid;
      } else {
        return mid;
      }
    }
    
    if (A[right] == target) {
      return right;
    }
    if (A[right] < target) {
      return right + 1;
    }
    if (A[left] == target) {
      return left;
    }
    return left + 1;
  }
}
