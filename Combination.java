/**
 * Given two integers n and k, return all possible combinations of k numbers out
 * of the range [1, n].
 * You may return the answer in any order.
 */
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> subsets = new ArrayList();
        generateSubsets(1, n, new ArrayList(), subsets, k);
        return subsets;
    }

    private void generateSubsets(int start, int n, List<Integer> current, List<List<Integer>> subsets, int k) {
        if (current.size() == k) {
            subsets.add(new ArrayList(current));
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            generateSubsets(i + 1, n, current, subsets, k);
            current.remove(current.size() - 1);
        }
    }
}
