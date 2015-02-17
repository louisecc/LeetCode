/*
 * Given a set of distinct integers, S, return all possible subsets.
 * Note:
 * Elements in a subset must be in non-descending order.
 * The solution set must not contain duplicate subsets.
 * For example,
 * If S = [1,2,3], a solution is:
 * [
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/

public class Solution {
  public List<List<Integer>> subsets(int[] S) {
    List<List<Integer>> subsets = new ArrayList<List<Integer>>();
    if (S == null || S.length == 0) {
      return res;
    }
    List<Integer> set = new ArrayList<Integer>();
    Arrays.sort(S);
    helper(subsets, set, S, 0);
    return subsets;
  }
  
  private void helper(List<List<Integer>> subsets, List<Integer> set, int[] num, int pos) {
    subsets.add(new ArrayList<Integer>(set));
    
    for (int i = pos; i < num.length; i++) {
      set.add(num[i]);
      helper(subsets, set, num, i + 1);
      set.remove(set.size() - 1);
    }
  }
}
