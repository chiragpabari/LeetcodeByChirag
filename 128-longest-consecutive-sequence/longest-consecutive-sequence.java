class Solution {
    public int longestConsecutive(int[] nums) {

        int n = nums.length;
        HashSet<Integer> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st.add(nums[i]);
        }

        int maxStreak = 0;

        for (int num : st) {

            if (!st.contains(num - 1)) { // num is starting point

                int currNum = num;
                int currStreak = 1;

                while (st.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                maxStreak = Math.max(currStreak, maxStreak);

            }
        }

        return maxStreak;
    }
}