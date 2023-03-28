import java.util.LinkedList;

public class Piece {
    public static final String PieceinFront = null;
	//public static int[] move;
    int xp;
    int yp;
    static int x;
    static int y; 
 static boolean isWhite;
    LinkedList<Piece> ps;
    String name;

    public Piece(int xp, int yp, boolean isWhite, String n,  LinkedList<Piece> ps){
        this.xp = xp;
        this.yp = yp;
        x = xp*64;
        y = yp*64; 
        this.isWhite = isWhite;
        this.ps = ps;
        name = n;
        ps.add(this);

    }
    

    /**
     */
    public void move(int xp, int yp){
        if(ChessGame.Piece(xp*64, yp*64)!= null){
            if(ChessGame.Piece(xp*64, yp*64).isWhite != isWhite){
             ChessGame.Piece(xp*64, yp*64).killPiece();
            }else {
                x=this.xp*64;
                y=this.yp*64;
                    return;
            }
        }
        this.x = xp;
        this.y = yp;
        x = xp*64;
        y = yp*64; 
       

    }

        
    public void killPiece(){
        ps.remove(this);
    }

    public static boolean Piece(int piece,boolean isWhite2) {
        return  true;
    }

    public static boolean grabpiece(int piece) {
        return true;
    }
    
   
}

