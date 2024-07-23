class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] sum=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                sum[i][j]=mat[i-1][j-1]+sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1];
            }
        }
        int[][] res=new int[m][n];
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                int r1=Math.max(0,r-k);
                int c1=Math.max(0,c-k);
                int r2=Math.min(m-1,r+k);
                int c2=Math.min(n-1,c+k);
                r1++;
                c1++;
                r2++;
                c2++;
                res[r][c]=sum[r2][c2]-sum[r2][c1-1]-sum[r1-1][c2]+sum[r1-1][c1-1];
            }
        }
        return res;
    }
}