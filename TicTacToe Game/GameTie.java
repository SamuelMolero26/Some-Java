public class GameTie {
    public static boolean hasTied(char[][] board)
    {
        for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
    }
    
}
