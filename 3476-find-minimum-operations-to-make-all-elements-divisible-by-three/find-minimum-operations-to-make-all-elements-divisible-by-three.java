class Solution {
    public int minimumOperations(int[] nums) {

        int n = nums.length;
        int op = 0;

        for (int i = 0; i < n; i++) {
            int num = nums[i] % 3;
            op += Math.min(num, 3 - num);
        }

        return op;

    }
}