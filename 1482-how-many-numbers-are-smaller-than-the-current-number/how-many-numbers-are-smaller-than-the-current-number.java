class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {

        int n = arr.length;
        int count = 0;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[i]) {
                    count++;
                }
            }

            for (int k = 0; k < i; k++) {
                if (arr[k] < arr[i]) {
                    count++;
                }
            }

            ans[i] = count;
            count = 0;
        }

        return ans;
    }
}