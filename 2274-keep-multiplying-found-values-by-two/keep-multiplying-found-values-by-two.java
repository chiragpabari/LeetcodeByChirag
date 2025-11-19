class Solution {
    public int findFinalValue(int[] nums, int original) {

        int n = nums.length;
        HashSet<Integer> st=new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

         for (int i = 0; i < n; i++) {
            
            if (st.contains(original)) {
                original = original * 2;
            }

        }

        return original;
    }
}