class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int count=0;
        int max=nums[nums.length-1];
        int min=nums[0];
        while(start<end){
            if(nums[start]+nums[end]==k){
                count+=1;
                start++;
                end--;
            }
            else{
               if(k-nums[end]<nums[start])
                   end--;
               if(k-nums[start]>nums[end])
                    start++;
              
                
            }
        }
        return count;
    }
}