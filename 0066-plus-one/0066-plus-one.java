class Solution {
    public int[] plusOne(int[] digits) {
        int carry=1;
        int[] result;
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]==9 && (i==n-1||carry==1)){
                digits[i]=0;
                carry=1;
            }
            else{
                digits[i]=digits[i]+carry;
                carry=0;
            }
        }
        if(digits[0]==0){
            result=new int[n+1];
            result[0]=1;
            result[n]=0;
            return result;
        }
        else{
            result=new int[n];
            result=digits;
            return result;
        }
    }
}