class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int s=0;
        int e=0;
        double avg=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            e++;
            if((e-s)==k){
                if(sum>avg){
                    avg=sum;
                    sum=sum-nums[s];
                    s+=1;
                }
                else{
                    sum=sum-nums[s];
                    s+=1;
                }
            }
        }
        return avg/k;
    }
}