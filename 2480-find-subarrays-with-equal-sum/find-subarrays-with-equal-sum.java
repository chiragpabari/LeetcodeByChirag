class Solution {
    public boolean findSubarrays(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;

        for (int i = 1; i < n; i++) {

            if (mp.containsValue(nums[i] + nums[i - 1])) {
                return true;
            }

            mp.put(i, nums[i] + nums[i - 1]);

        }

        return false;
    }
}