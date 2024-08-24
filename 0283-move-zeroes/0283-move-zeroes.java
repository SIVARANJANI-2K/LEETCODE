class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        int first=0;
        while(first<nums.length){
          if(nums[first]!=0){
              int swap=nums[first];
               nums[first]=nums[zeros];
               nums[zeros]=swap;
              
              zeros++;  
          }
          
          first++;
        
        }
    }
}