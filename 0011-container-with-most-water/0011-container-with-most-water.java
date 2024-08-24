class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int Area=0;
        while(left<right){
            int heigh=Math.min(height[left],height[right]);
            int dist=right-left;
            int current=heigh*dist;
            if(current>Area){
                Area=current;
            }
            if(height[left]<height[right])
                left++;
            else{
                right--;
            }
        }
        return Area;
    }
}