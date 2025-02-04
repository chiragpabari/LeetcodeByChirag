class Solution {
    public int maxAscendingSum(int[] nums) {

        int asc = nums[0];
        int max = 0;
        int n = nums.length;

        if (n == 1)
            return nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > nums[i - 1]) {
                asc += nums[i];
            }

            else {
                max = Math.max(asc, max);
                asc = nums[i];
            }

            max = Math.max(asc, max);

        }

        return max;
    }
}