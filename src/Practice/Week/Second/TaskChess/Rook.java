package Practice.Week.Second.TaskChess;

public class Rook extends ChessPiece {
    public Rook(String color) {
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


        int differenceInLine = Math.abs(line - toLine);
        int differenceInColumn = Math.abs(column - toColumn);


        if (differenceInLine > 0 && differenceInColumn > 0) {
            System.out.println("только по горизонтали или вертикали");
            return false;
        }

        if (differenceInLine > 0 && differenceInColumn == 0) {
            for (int j = 1; j < differenceInLine; j++) {
                if ((toLine < line) && (toColumn == column)
                        && chessBoard.board[line - j][column] != null) {
                    System.out.println("Не прошли в низ");
                    return false;
                } else if ((toLine > line) && (toColumn == column)
                        && chessBoard.board[line + j][column] != null) {
                    System.out.println("Не прошли на верх");
                    return false;
                }
            }
        }

        if (differenceInColumn > 0 && differenceInLine == 0) {
            for (int j = 1; j < differenceInColumn; j++) {
                if ((toColumn < column) && (toLine == line)
                        && chessBoard.board[line][column - j] != null) {
                    System.out.println("Не прошли на лево");
                    return false;
                } else if ((toColumn > column) && (toLine == line)
                        && chessBoard.board[line][column + j] != null) {
                    System.out.println("Не прошли на право");
                    return false;
                }
            }
        }

        if (chessBoard.board[toLine][toColumn] != null && getColor().equals(chessBoard.board[toLine][toColumn].getColor())) {
            System.out.println("Вы пытаетесь съесть фигуру вашего цвета");
            return false;
        }

        return true;
    }

    @Override
    public String getSymbol() {
        return "R";
    }
}
