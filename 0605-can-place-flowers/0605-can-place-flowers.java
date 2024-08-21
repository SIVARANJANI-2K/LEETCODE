class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=n;
        if(flowerbed.length==1){
            if(flowerbed[0]==0 && n==1)
                return true;
            if((flowerbed[0]==0||flowerbed[0]==1) && n==0)
                return true;
            return false;
        }
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(i!=0 && i<flowerbed.length-1){
                   if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                       flowerbed[i]=1;
                       count--;
                   }
                }
                else if(i==0){
                    if(flowerbed[i+1]==0){
                        flowerbed[i]=1;
                        count--;
                    }
                }
                else{
                    if(flowerbed[i-1]==0){
                        flowerbed[i]=1;
                        count--;;
                    }
                }
            }
            if(count<0)
                return true;
        }
        if(count==0)
            return true;
        return false;
    }
}