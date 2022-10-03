package Practice.Week.Second.TaskChess;

public class Horse extends ChessPiece {


    public Horse(String color) {
        super(color);
    }

    public String getSymbol() {
        return "H";
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

        if (chessBoard.board[toLine][toColumn] != null && getColor().equals(chessBoard.board[toLine][toColumn].getColor())) {
            System.out.println("Вы пытаетесь съесть фигуру вашего цвета");
            return false;
        }

        int xLine = Math.abs(line - toLine);
        int yColumn = Math.abs(column - toColumn);
        //int sumXY = xLine + yColumn;
        return ((yColumn == 2 && xLine == 1) || (yColumn == 1 && xLine == 2)); //sumXY == 3;

        /*
        public boolean isValid(int r1, int c1, int r2, int c2) {
    // use pythagoras to ensure that a move makes a right-angled
    // triangle move with sides of 1 and 2. 1-squared + 2 squared is 5.
        int deltaR = r2 - r1;
        int deltaC = c2 - c1;
        return 5 == deltaR * deltaR + deltaC * deltaC;
        }
         */
    }


}
