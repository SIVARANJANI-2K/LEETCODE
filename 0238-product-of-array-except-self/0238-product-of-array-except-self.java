class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[n];
        int[] suffix=new int[n];
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=1;
            prefix[i]=1;
            suffix[i]=1;
        }
        int i=n-2;
        int j=1;
        while(i>=0 && j<n){
            prefix[j]=prefix[j-1]*nums[j-1];
            suffix[i]=suffix[i+1]*nums[i+1];
            i--;
            j++;
        }
        for(i=0;i<n;i++){
            result[i]=prefix[i]*suffix[i];
        }
        return result;
    }
}