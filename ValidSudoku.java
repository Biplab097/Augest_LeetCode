class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                char c = board[i][j];
                if(c!='.'){
                    //System.out.println("in print "+c);
                    if(valid(board,i,j,c)==false)
                        return false;
                }
            }
        }
        return true;
    }
    public boolean valid(char[][] board,int row,int col,char c){
        
        for(int i=0;i<9;i++){
            if(board[row][i]==c && i!=col) return false;
            if(board[i][col]==c && i!=row) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==c && ((3*(row/3)+i/3)!=row && (3*(col/3)+i%3)!=col))
                return false;
        }
        return true;
    }
}
