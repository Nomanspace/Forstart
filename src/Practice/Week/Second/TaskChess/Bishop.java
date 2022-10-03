package Practice.Week.Second.TaskChess;

public class Bishop extends ChessPiece {

    public Bishop(String color) {
        super(color);
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

        if (Math.abs(toLine - line) != Math.abs(toColumn - column)) {
            System.out.println("Не прошли по диагонали");
            return false;
        }

        int differenceInRows = Math.abs(line - toLine);

        for (int j = 1; j < differenceInRows; j++) {
            if ((toLine < line) && (toColumn > column)
                    && chessBoard.board[line - j][column + j] != null) {
                System.out.println("Не прошли с верху на право");
                return false;
            } else if ((toLine > line) && (toColumn > column)
                    && chessBoard.board[line + j][column + j] != null) {
                System.out.println("Не прошли с низу на право");
                return false;
            } else if ((toLine > line) && (toColumn < column)
                    && chessBoard.board[line + j][column - j] != null) {
                System.out.println("Не прошли с низу на лево");
                return false;
            } else if ((toLine < line) && (toColumn < column)
                    && chessBoard.board[line - j][column - j] != null) {
                System.out.println("Не прошли с верху на лево");
                return false;
            }

        }

        if (chessBoard.board[toLine][toColumn] != null && getColor().equals(chessBoard.board[toLine][toColumn].getColor())) {
            System.out.println("Вы пытаетесь съесть фигуру вашего цвета");
            return false;
        }

        return false;
    }

    @Override
    public String getSymbol() {
        return "B";
    }
}
