class Solution {
    public String removeOccurrences(String s, String part) {

        int n1 = s.length();
        int n2 = part.length();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < n1; i++) {

            char curr = s.charAt(i);
            st.push(curr);

            if (st.size() >= n2) { // Check if the stack has enough characters for comparison

                StringBuilder temp = new StringBuilder("");
                int j = n2 - 1;
                int c = 0;

                while (st.size() != 0 && j >= 0 && part.charAt(j) == st.peek()) {

                    temp.append(st.pop());
                    j--;
                    c++;

                }

                if (c != n2) { // means part is not present

                    // restore characters

                    for (int k = temp.length() - 1; k >= 0; k--) {
                        st.push(temp.charAt(k));
                    }

                }

            }

        }

        StringBuilder ans = new StringBuilder("");

        while (st.size() != 0) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();

    }
}