class Solution {

    static long distribution(int arr[], long candy) {

        long total = 0;

        for (int j = 0; j < arr.length; j++) {
            long q =  arr[j] / candy;
            total += q;
        }

        return total;

    }

    public int maximumCandies(int[] candies, long k) {

        int n = candies.length;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += candies[i]; // total candies available
        }

        long max = 0; // max store maxmium number of candies the students can get
        
         for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        long st = 1;
        long end =sum;
        long ans = 0; // answer variable

        

        while (st <= end) {

            long mid = st + (end - st) / 2;

            long c = distribution(candies, mid); //  number of childrens that can receive mid number of candies

            if (c >= k) {
                ans = mid; //  if distribution is possible for aleast k childrens then mid is possible answer
                st = mid + 1; 
            } else {
                end = mid - 1;
            }
        }
        
        return (int) ans;
    }
}