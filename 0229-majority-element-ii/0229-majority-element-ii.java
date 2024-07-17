class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        int majority1=0;
        int majority2=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(majority1==nums[i]){
                count1+=1;
            }
            else if(majority2==nums[i]){
                count2+=1;
            }
            else if(count1==0){
                majority1=nums[i];
                count1=1;
            }
            else if(count2==0){
                majority2=nums[i];
                count2=1;
            }
            else{
                count1-=1;
                count2-=1;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==majority1)
                count1++;
            else if(num==majority2)
                count2++;
        }
        if(count1>Math.floor(n/3))
            res.add(majority1);
        if(count2>Math.floor(n/3))
            res.add(majority2);
        return res;
    }
}