class haswon {
    public static char HasWon(char[][] board)
    {
        //Row
        for(int r = 0; r < 3; r++){
            if(board[r][0] == board[r][1] && board[r][1] == board[r][2] && board[r][0] != '-'){
               return board[r][0];
            }
        }
        //Column 
        for(int c =0; c < 3; c++)
        {
        if(board[0][c] == board[1][c] && board[1][c] == board[2][c] && board[0][c] != '-') {
            
        return board[0][c];
          }
        }
        //Diagonals
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') 
        {
          return board[0][0];
        }
        if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') 
        {
          return board[2][0];
        }
        return '-';
    
   }
}



