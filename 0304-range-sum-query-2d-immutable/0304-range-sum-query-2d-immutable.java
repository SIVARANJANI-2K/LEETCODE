class NumMatrix {
    int[][] sum;
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        sum=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
                sum[i][j]=matrix[i-1][j-1]+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        row1++;
        col1++;
        row2++;
        col2++;
        return sum[row2][col2]-sum[row1-1][col2]-sum[row2][col1-1]+sum[row1-1][col1-1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */