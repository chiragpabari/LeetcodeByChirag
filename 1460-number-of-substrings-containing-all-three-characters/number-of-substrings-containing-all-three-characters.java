class Solution {

    private boolean HasAll(int[] freq) {
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
    }

    public int numberOfSubstrings(String s) {

        int left = 0;
        int right = 0;
        int n = s.length();
        int freq[] = new int[3];
        int total = 0;

        while (right < n) {

            freq[s.charAt(right) - 'a']++;

            while (HasAll(freq)) {

                // All substrings from current window to end are valid

                total += n - right;
                freq[s.charAt(left) - 'a']--;
                left++;

            }

            right++;

        }

        return total;
    }
}