class Solution {
    public boolean isArraySpecial(int[] nums) {
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            flag = (nums[i] % 2 != nums[i + 1] % 2);
            if (flag == false) {
                break;
            }
        }
        return flag;
    }
}