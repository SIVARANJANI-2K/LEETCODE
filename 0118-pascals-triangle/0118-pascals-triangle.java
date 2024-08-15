class Solution {
    public List<List<Integer>> generate(int numRows) {
            if(numRows==0){
                return new ArrayList<>();
            }
            List<List<Integer>> res=new ArrayList<>();
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            res.add(temp);
            if(numRows==1){
                return res;
            }
            for(int i=1;i<numRows;i++){
                temp=res.get(i-1);
                List<Integer> temp2=new ArrayList<>();
                temp2.add(1);
                for(int j=0;j<temp.size()-1;j++){
                    temp2.add(temp.get(j)+temp.get(j+1));
                }
                temp2.add(1);
                res.add(temp2);
            }
            return res;
    }
}