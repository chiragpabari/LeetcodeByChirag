class Solution {
    public String reverseVowels(String s) {
          StringBuilder sb=new StringBuilder(s);
        int n=s.length();
         int i=0;
         int j=n-1;
         while(i<j){
            char ichar=s.charAt(i);
            char jchar=s.charAt(j);
            boolean bool1= (ichar== 'a'||ichar=='A'||ichar=='e'||ichar=='E'||ichar=='i'||ichar=='I'||ichar=='o'||ichar=='O'|| ichar=='u'||ichar=='U');
            boolean bool2=(jchar== 'a'||jchar=='A'||jchar=='e'||jchar=='E'||jchar=='i'||jchar=='I'||jchar=='o'||jchar=='O'|| jchar=='u'||jchar=='U');
                       
                        if(!bool1){
                         i++;      //if char at i is not a vowel
                       }
                       else if(!bool2){
                        j--;       //if char at j is not a vowel
                       }
                      
                      else{
                         char temp = sb.charAt(i);
                         sb.setCharAt(i, sb.charAt(j));
                         sb.setCharAt(j, temp);
                         i++;
                         j--;
                       }
         }  

                 System.out.println(sb);
            
           return sb.toString(); //Coverting string builder back to string

    }
}