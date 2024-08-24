class Solution {
    public void moveZeroes(int[] nums) {
        int zeros=0;
        int first=0;
        while(first<nums.length){
          if(nums[first]==0){
              zeros++;  
          }
          else{ 
                  int swap=nums[first-zeros];
                  nums[first-zeros]=nums[first];
                  nums[first]=swap;
              
           }
          first++;
        
        }
    }
}