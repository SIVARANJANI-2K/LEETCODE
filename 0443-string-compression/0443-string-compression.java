class Solution {
    public int compress(char[] chars) {
        String s="";
        int count=1;
        int i;
        for(i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                if(count==1){
                    s+=chars[i];
                }
                else{
                    s+=chars[i];
                    s+=String.valueOf(count);
                }
                count=1;
            }
        }
        if(count==1){
                    s+=chars[i];
            }
        else{
                    s+=chars[i];
                    s+=String.valueOf(count);
        }
        
        for(int j=0;j<s.length();j++){
            chars[j]=s.charAt(j);
        }
        return s.length();
    }
}