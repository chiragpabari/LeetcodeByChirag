class Solution {
    public int romanToInt(String s) {

        HashMap<Character, Integer> mp = new HashMap<>();
        int n = s.length();
        int ans = 0;

        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        for (int i = 0; i < n - 1; i++) {

            char curr = s.charAt(i);

            if (mp.get(curr) < mp.get(s.charAt(i + 1))) {
                ans -= mp.get(curr);
            } else {
                ans += mp.get(curr);
            }
        }

        ans += mp.get(s.charAt(n - 1));

        return ans;
    }
}