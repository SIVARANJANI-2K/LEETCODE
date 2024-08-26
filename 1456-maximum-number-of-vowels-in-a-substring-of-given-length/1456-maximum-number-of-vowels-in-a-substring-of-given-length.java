class Solution {
    public int maxVowels(String s, int k) {
        int end=0;
        int start=0;
        int maxCount=Integer.MIN_VALUE;
        int currentCount=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                currentCount+=1;
            }
            end+=1;
            if(end-start==k){
                if(currentCount>maxCount){
                    maxCount=currentCount;
                }
                if(isVowel(s.charAt(start))){
                    currentCount-=1;
                }
                start+=1;
            }
        }
        return maxCount;
    }
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'|c=='o'||c=='u')
            return true;
        return false;
    }
}