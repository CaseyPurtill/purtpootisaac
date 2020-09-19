
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
        if(dir == "left" && possibleLeft) {
                this.xcord -= 1;
        }
        else if(dir == "right" && possibleRight) {
            if(this.xcord < 8) {
                this.xcord += 1;
            }
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
        if(dir == "left") {
            if(this.xcord > 0) {
                this.xcord -= 1;
            }
        }
        else if(dir == "right") {
            if(this.xcord < 8) {
                this.xcord += 1;
            }
        }
        if(this.ycord < 8) {
            this.ycord +=1;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("fuck you and your mother");

        CheckerPiece test = new CheckerPiece();
    }
}