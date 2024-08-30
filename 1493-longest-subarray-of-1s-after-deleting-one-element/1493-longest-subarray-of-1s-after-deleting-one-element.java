class Solution {
    public int longestSubarray(int[] nums) {
        int zeroSum=0;
        int concurrentOnes=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                concurrentOnes=concurrentOnes-zeroSum;
                zeroSum=concurrentOnes;
            }
            if(nums[i]==1){
                concurrentOnes+=1;
            }
            max=Math.max(concurrentOnes,max);
        }
        if(max==nums.length)
             max=max-1;
        return max;
    }
}