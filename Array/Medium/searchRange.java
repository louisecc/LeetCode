/*
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4]. 
 */
 
public class Solution {
  public int[] searchRange(int[] A, int target) {
    int left, right, mid;
    int[] bound = new int[2];
    
    left = 0;
    right = A.length - 1;
    while (left + 1 < right) {
      mid = left + (right - left) / 2;
      if (A[mid] < target) {
        left = mid;
      } else if (A[mid] > target) {
        right = mid;
      } else {
        right = mid;
      }
    }
    if (A[left] == target) {
      bound[0] = left;
    } else if (A[right] == target) {
      bound[0] = right;
    } else {
      bound[0] = bound[1] = -1;
      return bound;
    }
    
    left = bound[0];
    right = A.length - 1;
    while (left + 1 < right) {
      mid = left + (right - left) / 2;
      if (A[mid] < target) {
        left = mid;
      } else if (A[mid] > target) {
        right = mid;
      } else {
        left = mid;
      }
    }
    if (A[right] == target) {
      bound[1] = right;
    } else if (A[left] == target) {
      bound[1] = left;
    } else {
      bound[0] = bound[1] = -1;
      return bound;
    }
    
    return bound;
  }
}
