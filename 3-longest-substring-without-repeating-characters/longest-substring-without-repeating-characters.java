class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int max = 0;
        int sub = 0;
        HashSet<Character> st = new HashSet<>();

        // i and j are the start and end of substring with no duplicates

        for (int i = 0, j = 0; i < n; i++) {

            char curr = s.charAt(i);

            while (st.contains(curr)) {
                st.remove(s.charAt(j));
                j++;
            }

            st.add(s.charAt(i));
            max = Math.max(max, i - j + 1);
        }

        return max;
    }
}