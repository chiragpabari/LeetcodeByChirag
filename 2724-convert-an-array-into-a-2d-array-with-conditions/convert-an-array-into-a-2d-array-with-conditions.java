class Solution {

    private static boolean allValuesZero(HashMap<Integer, Integer> map) {
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }

            else {
                mp.put(nums[i], 1);
            }
        }

        while (!allValuesZero(mp)) {

            List<Integer> row = new ArrayList<>();

            for (Integer key : new HashSet<>(mp.keySet())) {

                if (mp.get(key) > 0) { // Add the value only if it exists
                    row.add(key);
                    mp.put(key, mp.get(key) - 1);
                }
            }
            ans.add(row);
        }

        return ans;

    }
}