class Solution {
    public int minimumRecolors(String blocks, int k) {

        int n = blocks.length();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n - k; i++) {

            int whites = 0;

            for (int j = i; j < i + k; j++) {

                char curr = blocks.charAt(j);

                if (curr == 'W') {
                    whites++;
                }
            }

            min = Math.min(whites, min);
        }

        return min;

    }
}