class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        String result="";
        int i=0;
        for(i=0;i<len1;i++){
            result+=word1.charAt(i);
            if(i<len2){
                 result+=word2.charAt(i);
            }
           
        }
        while(i<len2){
            result+=word2.charAt(i);
            i++;
        }
        return result;
    }
}