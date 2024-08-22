class Solution {
    public String reverseWords(String s) {
        
       
        String[] array=s.trim().split(" ");
        
        int n=array.length-1;
        String reverse="";
        while(n>=0){
            if(!array[n].equals("")){
                reverse+=array[n];
                if(n!=0){
                 reverse+=" ";
                }
            }
            
            
           
            
            n--;
        }
        return reverse;
    }
}