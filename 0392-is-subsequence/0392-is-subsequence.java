class Solution {
    public boolean isSubsequence(String s, String t) {
        int i;
        int j=0;
        for(i=0;i<t.length();i++){
            if(j==s.length())
                return true;
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
        }
        if(j==s.length())
            return true;
        return false;
    }
}