class Solution {
    public int differenceOfSum(int[] nums) {

        int es = 0;
        int ds = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int temp = nums[i];
            es += temp;

            while (temp != 0) {
                ds += (temp % 10);
                temp = temp / 10;
            }

        }

        return Math.abs(es - ds);
    }
}