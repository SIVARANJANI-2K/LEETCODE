class Solution {
    public boolean isValidSudoku(char[][] board) {
      for(int i=0;i<9;i++){
           int row[]=new int[10];
           int col[]=new int[10];
          for(int j=0;j<9;j++){
              if(board[i][j]!='.'){
                row[board[i][j]-'0']++; 
               if(row[board[i][j]-'0']>1)
                   return false;
              }
              
              if(board[j][i]!='.'){
                col[board[j][i]-'0']++;
                if(col[board[j][i]-'0']>1){
                  return false;
                  }
              }
              if(j%3==0){
                  int r=i-(i%3);
                  int c=j-(j%3);
                  int box[]=new int[10];
                  for(int l=0;l<3;l++){
                      for(int m=0;m<3;m++){
                          if(board[l+r][c+m]!='.'){
                          box[board[l+r][c+m]-'0']++;
                          if(box[board[l+r][c+m]-'0']>1)
                              return false;
                          }
                      }
                  }
              }
          }
      }
        return true;
    }
}