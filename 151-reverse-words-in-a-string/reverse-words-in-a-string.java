class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String ans=""; 
        int n=s.length();

        for(int i=n-1;i>=0;i--){
            char curr=s.charAt(i);
            if(curr!=' '){
                sb.append(curr); 
            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder(""); //make StringBuilder empty to store next word in it
        
            }
        }
         sb.reverse();
         ans+=sb;  //concat last reversed word with ans string
         ans=ans.replaceAll(" +"," "); //to remove multiple spaces between strings
         return ans.trim(); //to remove leading and trailing spaces of string

    }
}