class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int countp=0; //count positve numbers
        int countn=0; //count negative numbers
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                continue; //not intrestd in zeros
            }
            else if(nums[i]>0){
                countp++;
            }
            else{
                countn++;
            }
        }
           if(countp>=countn){
            return countp;
           }
           return countn;
    }
}