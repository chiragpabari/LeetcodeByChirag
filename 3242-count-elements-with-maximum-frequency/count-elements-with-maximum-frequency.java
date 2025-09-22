class Solution {
    public int maxFrequencyElements(int[] nums) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }

        }

        int max = 1;

        for (int val : mp.values()) {
            max = Math.max(max, val);
        }

        for (int k : mp.keySet()) {
            if (mp.get(k) == max) {
                sum += max;
            }
        }

        return sum;

    }
}