class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder("");
        int count=1;
        int i;
        for(i=0;i<chars.length-1;i++){
            if(chars[i]==chars[i+1]){
                count++;
            }
            else{
                if(count==1){
                    sb.append(chars[i]);
                }
                else{
                    sb.append(chars[i]);
                    sb.append(String.valueOf(count));
                }
                count=1;
            }
        }
        if(count==1){
                    sb.append(chars[i]);
            }
        else{
                    sb.append(chars[i]);
                    sb.append(String.valueOf(count));
        }
        
        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();
    }
}