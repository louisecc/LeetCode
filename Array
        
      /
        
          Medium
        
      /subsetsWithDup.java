/*
 * Given a collection of integers that might contain duplicates, S, return all possible subsets.
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,2], a solution is:
 * [
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
  ]
  */

public class Solution {
  public List<List<Integer>> subsetsWithDup(int[] num) {
    List<List<Integer>> subsets = new ArrayList<List<Integer>>();
    if (num == null || num.length == 0) {
      return subsets;
    }
    
    List<Integer> set = new ArrayList<Integer>();
    Arrays.sort(num);
    helper(subsets, set, num, 0);
    return subsets;
  }
  
  private void helper(List<List<Integer>> subsets, List<Integer> set, int[] num, int pos) {
    subsets.add(new ArrayList<Integer>(set));
    
    for (int i = pos; i < num.length; i++) {
      if (i != pos && num[i] == num[i - 1]) {
        continue;
      }
      set.add(num[i]);
      helper(subsets, set, num, i + 1);
      set.remove(set.size() - 1);
    }
  }
}
