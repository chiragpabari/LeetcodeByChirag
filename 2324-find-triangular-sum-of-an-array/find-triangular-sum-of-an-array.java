class Solution {
    public int triangularSum(int[] nums) {

        int n=nums.length;
        int newNums[]=new int[n];
        int st=0;
        int end=n-1;
        int c=end;

        while(c>0){
      
          while(st<end){
            nums[st]=(nums[st]+nums[st+1])%10;
            st++;
          }
          c--;
          end--;
          st=0;
        }
        
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }

        return nums[st];

    }
}