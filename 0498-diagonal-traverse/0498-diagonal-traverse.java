class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
      int m=mat.length;
      int n=mat[0].length;
        if(m==0||n==0){
            return new int[0];
        }
        int[] res=new int[m*n];
        int ind=0;
        int row=0;
        int col=0;
        int direction=1;
        while(row<m && col<n){
            res[ind++]=mat[row][col];
            int new_row=row+((direction==1)?-1:1);
            int new_col=col+((direction==1)?1:-1);
            if(new_row<0||new_row==m||new_col<0||new_col==n){
                if(direction==1){
                    row+=((col==n-1)?1:0);
                    col+=((col<n-1)?1:0);
                }
                else{
                    col+=(row==m-1)?1:0;
                    row+=(row<m-1)?1:0;
                }
                direction=1-direction;
            }
            else{
                row=new_row;
                col=new_col;
            }
            
        }
        return res;
    }
}