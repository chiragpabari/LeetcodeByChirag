class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int m=word1.length();
        int n=word2.length();
        String ans="";

        while(i<m || j<n){

            if(i<m){
                ans+=word1.charAt(i);
                i++;
            }
            if(j<n){
                ans+=word2.charAt(j);
                j++;
            }
            
        }

        return ans;
    }
}