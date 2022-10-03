package Practice.Week.Second.TaskChess;

public class Pawn extends ChessPiece {
    boolean isThisFirstTurn;

    public Pawn(String color) {
        super(color);
        this.isThisFirstTurn = true;
    }

    @Override
    public String getColor() {
        return this.color;

    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (!(chessBoard.checkPos(line) && chessBoard.checkPos(column))) {
            System.out.println("1");
            return false;
        }

        if (!(chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn))) {
            System.out.println("1_1");
            return false;
        }

        if (chessBoard.board[line][column] == null) {
            System.out.println("2");
            return false;
        }

        if (line == toLine && column == toColumn) {
            System.out.println("3");
            return false;
        }

        int xLine = toLine - line;
        int yColumn = toColumn - column;

        if (this.getColor().equals("Black") && xLine == -1 && yColumn == 0) {
            System.out.println("black pawn makes a move");
            return chessBoard.board[toLine][toColumn] == null;
        }

        if (this.getColor().equals("Black") && line == 6 && yColumn == 0 && xLine == -2) {
            System.out.println("black pawn makes a two cells move");
            return chessBoard.board[toLine][toColumn] == null;
        }

        if (this.getColor().equals("Black") && (Math.abs(yColumn) == 1 && xLine == -1) && !getColor().equals(chessBoard.board[toLine][toColumn].getColor())) {
            System.out.println("black pawn cuts the enemy");
            return chessBoard.board[toLine][toColumn] != null;
        }

        if (this.getColor().equals("White") && xLine == 1 && yColumn == 0) {
            System.out.println("White pawn makes a move");
            return chessBoard.board[toLine][toColumn] == null;
        }


        if (this.getColor().equals("White") && line == 1 && yColumn == 0 && xLine == 2) {
            System.out.println("White pawn makes a two cells move");
            return chessBoard.board[toLine][toColumn] == null;
        }

        if (this.getColor().equals("White") && (Math.abs(yColumn) == 1 && xLine == 1) && !getColor().equals(chessBoard.board[toLine][toColumn].getColor())) {
            System.out.println("White pawn cuts the enemy");
            return chessBoard.board[toLine][toColumn] != null;
        }


        System.out.println("none of the options converge");
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}

/*
go sleep few
*/
