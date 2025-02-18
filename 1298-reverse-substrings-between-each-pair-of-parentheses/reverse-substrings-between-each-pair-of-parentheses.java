class Solution {
    public String reverseParentheses(String s) {

        int n = s.length();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            char curr = s.charAt(i);

            if (curr == '(') {
                st.push(curr);
                continue;
            }

            else if (curr == ')') {

                StringBuilder str = new StringBuilder("");

                while (st.peek() != '(') {
                    str.append(st.pop());
                }

                st.pop(); // Popping opening bracket out of stack

                for (int j = 0; j < str.length(); j++) {
                    st.push(str.charAt(j)); // Push characters in reverse order
                }

            }

            else {
                st.push(curr);
            }
        }

        StringBuilder ans = new StringBuilder("");

        while (st.size() != 0) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();

    }
}