class Solution {
    public boolean check(int[] nums) {

        int violation = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {
                violation++;
            }
        }

        if (violation > 1) {
            return false;
        }

        return true;
    }
}