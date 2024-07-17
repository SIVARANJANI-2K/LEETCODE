class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int ans=nums[0];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])>Math.floor(n/2)){
                    ans=nums[i];
                    break;
                }
            }
        }
        return ans;
        
    }
}