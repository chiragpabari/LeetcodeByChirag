class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {

        int n = nums.length;
        int op = operations.length;

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(nums[i], i);
        }

        for (int i = 0; i < op; i++) {

            int key = operations[i][0];
            int temp = operations[i][1];
            int index = mp.get(key);

            nums[index] = temp;

            mp.remove(key);
            mp.put(temp, index); // Updating map with new value and index

        }

        return nums;
    }
}