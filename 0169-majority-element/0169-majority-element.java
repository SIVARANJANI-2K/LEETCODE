class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=0;
        int maj=0;
        for(int i=0;i<n;i++){
            if(maj==0){
                ans=nums[i];
            }
            maj+=nums[i]==ans?1:-1;
        }
        return ans;
        
    }
}