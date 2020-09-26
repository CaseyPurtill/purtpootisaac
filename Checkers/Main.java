
class Piece{
    int xcord;
    int ycord;
    String color;

    public void setXCord(int xcord) {
        this.xcord = xcord;
    }

    public void setYCord(int ycord) {
        this.ycord = ycord;
    } 

    public void setColor(String color) {
        this.color = color;
    }
 }

class CheckerPiece extends Piece {
    boolean possibleLeft;
    boolean possibleRight;
    boolean possibleJumpLeft;
    boolean possibleJumpRight;

    public void setPossibleLeft(boolean possibleLeft) {
        this.possibleLeft = possibleLeft;
    }

    public void setPossibleRight(boolean possibleRight) {
        this.possibleRight = possibleRight;
    }

    public void setPossibleJumpLeft(boolean possibleJumpLeft) {
        this.possibleJumpLeft = possibleJumpLeft;
    }

    public void setPossibleJumpRight(boolean possibleJumpRight) {
        this.possibleJumpRight = possibleJumpRight;
    }
}

class RedCheckerPiece extends CheckerPiece {
    
    public RedCheckerPiece(int xcord, int ycord) 
    { 
        this.xcord = xcord;
        this.ycord = ycord;
        this.color = "Red";
    }

    public void move(String dir) {
        if(dir.equals("left") && possibleLeft) {
                this.xcord -= 1;
        }
        else if(dir.equals("right") && possibleRight) {
                this.xcord += 1;
        }

        this.ycord -=1;
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
        if(dir.equals("left") && possibleLeft) {
                this.xcord -= 1;
        }
        else if(dir.equals("right") && possibleRight) {
            this.xcord += 1;
        }

        this.ycord +=1;
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