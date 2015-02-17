/* Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, 
 * where index1 must be less than index2. 
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2 
 */
 
public class Solution {
  public int[] twoSum(int[] numbers, int target) {
    if (numbers == null || numbers.length == 0) {
      return null;
    }
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int[] indices = new int[2];
    
    for (int i = 0; i < numbers.length; i++) {
      map.put(numbers[i], i + 1);
    }
    
    for (int i = 0; i < numbers.length; i++) {
      if (map.containsKey(target - numbers[i]) {
        int index1 = i + 1;
        int index2 = map.get(target - numbers[i]);
        if (index1 == index2) {
          continue;
        }
        indices[0] = index1;
        indices[1] = index2;
        return indices;
      }
    }
    
    return indices;
  }
}
