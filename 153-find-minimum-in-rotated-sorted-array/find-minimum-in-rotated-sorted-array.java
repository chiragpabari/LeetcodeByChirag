class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int st = 0;
        int end = n - 1;
        int min = nums[0]; // assume first element as minimum

        while (st <= end) {

            int mid = st + (end - st) / 2;

            min = Math.min(min, nums[mid]);

            if (nums[mid] > nums[end]) {
                st = mid + 1;  // minimum present on right of mid
            } else {
                end = mid - 1; // minimum present on left of mid
            }
        }

        return min;
    }
}