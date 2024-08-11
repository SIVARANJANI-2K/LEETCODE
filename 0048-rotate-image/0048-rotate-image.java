class Solution {
    public void rotate(int[][] matrix) {
        //outer
        
        int n=matrix.length;
        for(int row=0;row<n-1;row++){
            for(int col=row+1;col<n;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }
        for(int row=0;row<n;row++){
            reverse(matrix,row,n);
        }
        
    }
    public void reverse(int[][] matrix,int row,int n){
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=matrix[row][i];
            matrix[row][i]=matrix[row][j];
            matrix[row][j]=temp;
            j--;
            i++;
        }
    }
}