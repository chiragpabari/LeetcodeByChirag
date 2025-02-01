class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> ans = new ArrayList<>();
        HashSet<Integer> st = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int num = nums[i];

            if (st.contains(num)) {
                ans.add(num);
                st.remove(num);
            } else {
                st.add(num);
            }

        }

        return ans;

    }
}