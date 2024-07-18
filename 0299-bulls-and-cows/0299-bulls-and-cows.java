class Solution {
    public String getHint(String secret, String guess) {
       HashMap<String,Integer> maps=new HashMap<>();
       HashMap<String,Integer> mapg=new HashMap<>();
       int bull=0;
       int cows=0;
       for(int i=0;i<secret.length();i++){
           if(secret.charAt(i)==guess.charAt(i)){
               bull+=1;
           }
           else{
               if(maps.containsKey(String.valueOf(secret.charAt(i)))){
                   maps.put(String.valueOf(secret.charAt(i)),maps.get(String.valueOf(secret.charAt(i)))+1);
               }
               else
                    maps.put(String.valueOf(secret.charAt(i)),1);
               if(mapg.containsKey(String.valueOf(guess.charAt(i)))){
                    mapg.put(String.valueOf(guess.charAt(i)),mapg.get(String.valueOf(guess.charAt(i)))+1);
               }
               else
                   mapg.put(String.valueOf(guess.charAt(i)),1);
               
           }
       }
      int size=maps.size()<=mapg.size()?1:2;
      if(size==1){
          for(String key:maps.keySet()){
              if(mapg.containsKey(key)){
                  cows+=Math.min(maps.get(key),mapg.get(key));
              }
          }
      }
      else{
           for(String key:mapg.keySet()){
              if(maps.containsKey(key)){
                  cows+=Math.min(maps.get(key),mapg.get(key));
              }
          }
      }
       
       
      
       String result="";
       result=String.valueOf(bull)+"A"+String.valueOf(cows)+"B";
    return result;
        
        
    }
}