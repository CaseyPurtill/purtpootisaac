
class Piece{
    public int xcord;
    public int ycord;
    public String color;
 }

class CheckerPiece extends Piece {
     
}

class RedCheckerPiece extends CheckerPiece {

    public boolean possibleLeft, possibleRight;
    public boolean possibleJumpLeft, possibleJumpRight;
    
    public RedCheckerPiece(int xcord, int ycord) 
    { 
        this.xcord = xcord;
        this.ycord = ycord;
        this.color = "Red";
    }

    public void move(String dir) {
        //Handle the x
        if(dir.equals("left") && possibleLeft) {
                this.xcord -= 1;
        }
        else if(dir.equals("right") && possibleRight && (this.xcord < 8)) {
                this.xcord += 1;
        }

        //Handle the y 
        if(this.ycord > 0) {
            this.ycord -=1;
        }
    }
}

class BlackCheckerPiece extends CheckerPiece {
    
    public BlackCheckerPiece(int xcord, int ycord) 
    { 
        this.xcord = xcord;
        this.ycord = ycord;
        this.color = "Black";
    }

    public void move(String dir) {
        if(dir.equals("left") && (this.xcord > 0)) {
                this.xcord -= 1;
        }
        else if(dir.equals("right") && (this.xcord < 8)) {
            this.xcord += 1;
        }
        if(this.ycord < 8) {
            this.ycord +=1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("fuck you and your mother");

        CheckerPiece[] pieces = new CheckerPiece[16];
        for(int i = 0; i < 4; i++) {
            pieces[i] = new BlackCheckerPiece(i * 2, 0);
        }

        for(int i = 4; i < 8; i++) {
            pieces[i] = new BlackCheckerPiece((i - 4) * 2 + 1, 1);
        }

        for(int i = 8; i < 12; i++) {
            pieces[i] = new RedCheckerPiece((i - 8) * 2 + 1, 7);
        }

        for(int i = 12; i < 16; i++) {
            pieces[i] = new RedCheckerPiece((i - 12) * 2, 8);
        }

        CheckerPiece test = new CheckerPiece();
    }
}