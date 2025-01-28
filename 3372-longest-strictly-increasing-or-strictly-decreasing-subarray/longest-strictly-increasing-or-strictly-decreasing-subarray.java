class Solution {
    public int longestMonotonicSubarray(int[] nums) {

        int n = nums.length;

        int inc = 1;
        int dec = 1;
        int max = 1;

        for (int i = 1; i < n; i++) {

            if (nums[i] == nums[i - 1]) {

                inc = 1;
                dec = 1;

            }

            else if (nums[i] > nums[i - 1]) {

                inc++;
                dec = 1;
                max = Math.max(max, inc);

            }

            else {

                dec++;
                inc = 1;
                max = Math.max(max, dec);

            }
        }

        return max;

    }
}