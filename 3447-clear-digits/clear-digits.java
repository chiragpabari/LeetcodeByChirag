class Solution {
    public String clearDigits(String s) {

        int n = s.length();
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder("");

        for (int i = 0; i < n; i++) {

            char curr = s.charAt(i);
            int ascii = (int) curr;

            if (st.size() > 0 && (ascii >= 48 && ascii <= 57)) {
                st.pop();
                continue;
            }

            st.push(curr);

        }

        while (st.size() != 0) {
            str.append(st.pop());
        }

        return str.reverse().toString();

    }
}