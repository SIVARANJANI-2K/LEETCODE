class Solution {
    public void moveZeroes(int[] nums) {
        int first=0;
        int second=first+1;
        while(first<nums.length){
          if(nums[first]==0){
              while(second<nums.length && nums[second]==0){
                  second++;
              }
              if(second<nums.length){
                   nums[first]=nums[second];
                   nums[second]=0;
              }
             
              
          }
          first++;
          second++;
        }
    }
}