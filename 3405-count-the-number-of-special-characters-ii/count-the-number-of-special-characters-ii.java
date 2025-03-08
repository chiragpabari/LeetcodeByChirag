class Solution {
    public int numberOfSpecialChars(String word) {

        HashMap<Character, Integer> mp = new HashMap<>();
        int n = word.length();
        int sp = 0;

        for (int i = 0; i < n; i++) {

            char curr = word.charAt(i);
            int ascii = (int) curr;

            if (ascii >= 65 && ascii <= 90) {
                if (!mp.containsKey(curr)) {
                    mp.put(curr, i); // First uppercase occurence
                }
            }

            else {
                mp.put(curr, i); // Last lowercase occurence
            }
        }

        for (int i = 65; i <= 90; i++) {

            char curr1 = (char) i;
            char curr2 = (char) (i + 32);

            if (mp.containsKey(curr1) && mp.containsKey(curr2) && (mp.get(curr1) > mp.get(curr2))) {
                sp++;
            }
        }

        return sp;

    }
}