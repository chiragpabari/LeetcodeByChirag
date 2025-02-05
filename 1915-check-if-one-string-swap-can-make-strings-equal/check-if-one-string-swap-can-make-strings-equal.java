class Solution {
    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2))
            return true;

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {

            int ascii = (int) s1.charAt(i);
            freq1[ascii - 97]++;

        }

        for (int i = 0; i < s2.length(); i++) {
            int ascii = (int) s2.charAt(i);
            freq2[ascii - 97]++;
        }

        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        int d = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                d++;
            }
        }

        if (d > 2)
            return false;

        return true;

    }
}