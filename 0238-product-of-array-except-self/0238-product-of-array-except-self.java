class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;

        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=1;
           
        }
        int i=n-2;
        int j=1;
        while(j<n){
            result[j]=result[j-1]*nums[j-1];
            
            j++;
        }
        int temp=1;
        while(i>-1){
            result[i]=result[i]*nums[i+1]*temp;
            temp=temp*nums[i+1];
            i--;
        }
        return result;
    }
}