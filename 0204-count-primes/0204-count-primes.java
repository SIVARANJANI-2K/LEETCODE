class Solution {
    public int countPrimes(int n) {
     
      if(n==1||n==0||n==2)
        return 0; 
      boolean[] primes=new boolean[n]; 
      for(int i=0;i<n;i++){
        primes[i]=true;
      }
      for(int p=2;p*p<n;p++){
         if(primes[p]){
            for(int i=p*p;i<n;i+=p){
                primes[i]=false;
            }
         }
      }
     
      int count=1;
      for(int i=3;i<n;i+=2){
        if(primes[i]){
            count++;
        }
      }
      return count;
    }
}