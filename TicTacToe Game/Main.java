import java.util.Scanner;
class Main {
    private static final String Player1 = null;
    private static final String Player2 = null;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      //intro
      System.out.println("                           .                                                                                                        ");
      System.out.println("                   ##                                   #%                                             @*                           ");
      System.out.println("                  @/               .&@@&               @*            .@@@/        *@@@%              *@.          .%&/       .@@@.  ");
      System.out.println("                *@@@@,   /@.     %@                   (@@@@,       @@   &       @&                   &@@@&.    #@%   #@    (@/   @. ");
      System.out.println("              (@.#@      @/     @*                 #&.#@         @@    @@     *@                  @# @#       %@     &@   @# @@     ");
      System.out.println("                ,@      @.     /@      @.              /@       &#   &&  @* #  &#     ,@.             %@      %%    @&   %&     /@* ");
      System.out.println("                *@/%%   @(&.    *@@@@/                 ,@/%%    @*%@.           (@@@@,                 #&/@/   #@@@/      %@@@@/    ");
      System.out.println(" ");
      System.out.println("--------------New Game-----------");
      
  
      System.out.println("player #1 What's your name");
      String player1 = scan.nextLine();
      System.out.println("Player #2 Wha's your name");
      String player2 = scan.nextLine();


      //Board
      char [][] board = new char [3][3];
      for(int r = 0; r < board.length; r++)
      {
        for(int c = 0; c < board.length; c++)
        {
          board[r][c] = '-';
        }
      }
      //player's turn
      boolean isPlayer1 = true;
      boolean GameEnded = false;
      

      while(!GameEnded){
        drawboard(board);

        //player's turn 
        if(isPlayer1) {
          System.out.println(player1 + "'s Turn (x):");
        } else {
          System.out.println(player2 + "'s Turn (o):");
        }

        char symbol = '-';
        if(isPlayer1) {
          symbol = 'x';
        }
        else{
          symbol ='O';
        }

        //Row and Column Variables 
        int row = 0;
        int col = 0;
      //Row and column from user
      while(true)
      {
      System.out.println("Enter a row index (0,1,or 2)");
      row = scan.nextInt();
      System.out.println("Enter a column index (0,1,or 2)");
      col = scan.nextInt();

      //Check if row and column are valid 
      if(row < 0 || col < 0 || row > 2 || col > 2)
      {
        System.out.println("Row and Column are out of bound");
      }
      else if(board[row][col] != '-')
      {
        System.out.println("Someone already made a move there");
        }
        else{
          break;
        }
      }
      //Setting Positions 
      board[row][col] = symbol;
  
      //Check if player won 
      haswon WIN = new haswon();
      
      GameTie Tied = new GameTie();

      if( WIN.HasWon(board) == 'X')
      {
        System.out.println(player1 + " Has Won");
        GameEnded = true;
      }
      else if(WIN.HasWon(board) == 'O'){
        System.out.println(player2 + " Has Won");
        GameEnded = true;
      }
      else{
        if( Tied.hasTied(board)){
          System.out.println("its a tie");
          GameEnded = true;
        }
        else {
          //contie game 
         isPlayer1 = !isPlayer1;
        }

      }
    }
   }
     //drawing the board
    public static void drawboard(char[][] board)
    {
      for(int r = 0; r < 3; r++)
      {
        for(int c = 0; c  < 3; c++)
        {
          System.out.print(board[r][c]);
        }
          System.out.println();
      }
    }

    


    
      
      

    
      
  }
