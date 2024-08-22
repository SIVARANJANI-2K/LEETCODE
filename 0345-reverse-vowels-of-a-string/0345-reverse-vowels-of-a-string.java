class Solution {
   
    public static boolean checkVowel(char c){
         char[] vowels={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<10;i++){
            if(c==vowels[i]){
                return true;
            }
        }
        return false;
    }
    public String reverseVowels(String s) {
       
       int i=0;
       int j=s.length()-1;
       StringBuilder sb=new StringBuilder(s);
       while(i<=j){
           boolean st=checkVowel(s.charAt(i));
           boolean e=checkVowel(s.charAt(j));
           if(st && e){
              char temp=sb.charAt(i);
              sb.setCharAt(i,sb.charAt(j));
              sb.setCharAt(j,temp);
               i++;
               j--;
           }
           else if(st){
               j--;
           }
           else if(e){
               i++;
           }
           else{
               i++;
               j--;
           }
       }
      return sb.toString();
    }
}