class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans[] = new int[2];

        int n = grid.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int val = grid[i][j];

                if (mp.containsKey(val)) {
                    mp.put(val, mp.get(val) + 1);
                } else {
                    mp.put(val, 1);
                }
            }
        }

        for (int key : mp.keySet()) {
            if (mp.get(key) == 2) {
                ans[0] = key;
                break;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (!mp.containsKey(i)) {
                ans[1] = i;
                break;
            }
        }

        return ans;

    }
}