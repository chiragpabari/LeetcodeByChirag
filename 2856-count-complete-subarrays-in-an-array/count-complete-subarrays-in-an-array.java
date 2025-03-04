class Solution {
    public int countCompleteSubarrays(int[] nums) {

        int n = nums.length;
        int subarray = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }

        int distinct = set.size();

        for (int i = 0; i < n; i++) {

            HashSet<Integer> st = new HashSet<>();

            for (int j = i; j < n; j++) {
                st.add(nums[j]);
                if (st.size() == distinct) {
                    subarray++;
                }
            }
        }
        return subarray;
    }
}