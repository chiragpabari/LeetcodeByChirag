class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        ArrayList<Boolean> ans = new ArrayList<>();

        int n = nums.length;
        int m = l.length;

        for (int i = 0; i < m; i++) { // Trvaversing through all queries

            int temp[] = new int[r[i] - l[i] + 1];
            int k = 0;
            for (int j = l[i]; j <= r[i]; j++) { // Extracting elemnts to form subarray
                temp[k++] = nums[j];
            }

            Arrays.sort(temp);

            int diff = temp[1] - temp[0];

            boolean flag = true;

            for (int p = 2; p < temp.length; p++) {

                if (temp[p] - temp[p - 1] != diff) {
                    flag = false;
                    break;
                }

            }

            ans.add(flag);

        }

        return ans;
    }
}