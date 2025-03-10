class Solution {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < n; i++) {

            HashSet<Integer> st = new HashSet<>();

            for (int j = 0; j < n; j++) {
                st.add(matrix[i][j]);
            }

            for (int k = 1; k <= n; k++) {
                if (!st.contains(k)) {
                    return false;
                }
            }

        }

        for (int i = 0; i < n; i++) {

            HashSet<Integer> st = new HashSet<>();

            for (int j = 0; j < n; j++) {
                st.add(matrix[j][i]);
            }

            for (int k = 1; k <= n; k++) {
                if (!st.contains(k)) {
                    return false;
                }
            }

        }

        return true;
    }
}