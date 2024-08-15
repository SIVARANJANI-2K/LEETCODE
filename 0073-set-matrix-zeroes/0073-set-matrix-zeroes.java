class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Pair> zeros=new LinkedList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeros.add(new Pair(i,j));
                }
            }
        }
        int[] rows=new int[m];
        int[] cols=new int[n];
        while(!zeros.isEmpty()){
            Pair p=zeros.poll();
            int row=p.a;
            int col=p.b;
            int minus_row=row-1;
            int minus_col=col-1;
            if(cols[col]!=1){
                row=row+1;
                while(row<m ||minus_row>=0){
                    if(minus_row>=0){
                        matrix[minus_row][col]=0;
                    }
                    if(row<m){
                        matrix[row][col]=0;
                    }
                    row++;
                    minus_row--;
                }
            
            }
            row=p.a;
            if(rows[row]!=1){
                col=col+1;
                while(col<n||minus_col>=0){
                    if(minus_col>=0){
                        matrix[row][minus_col]=0;
                    }
                    if(col<n){
                        matrix[row][col]=0;
                    }
                    col++;
                    minus_col--;
                }
            }
            rows[p.a]=1;
            cols[p.b]=1;
            
        }
        
        
    
        
    }
}
class Pair{
    int a;
    int b;
    Pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}