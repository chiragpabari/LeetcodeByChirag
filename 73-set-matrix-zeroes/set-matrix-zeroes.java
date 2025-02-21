class Solution {
    public void setZeroes(int[][] matrix) {

        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (matrix[i][j] == 0) {

                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    temp.add(pair);

                }
            }
        }

        for (int k = 0; k < temp.size(); k++) {
            int row = temp.get(k).get(0);
            int col = temp.get(k).get(1);

            for (int i = 0; i < c; i++) {
                matrix[row][i] = 0;
            }
            for (int i = 0; i < r; i++) {
                matrix[i][col] = 0;
            }
        }

    }
}
