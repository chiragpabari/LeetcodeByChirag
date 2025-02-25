class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) > (n / 3)) {
                ans.add(key);
            }
        }

        return ans;
    }
}