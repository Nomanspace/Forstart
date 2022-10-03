package Practice.Week.Second.TaskChess;

public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    // передаем конечные координаты, в которые хотим пройти
    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        if (chessBoard.checkPos(line) && chessBoard.checkPos(column)) {
            for (int i = 0; i < 7; i++) {
                for (int j = 0; j < 7; j++) {
                    //просматриваем все ячейки на наличие фигур, если в ячейке есть фигура, то...
                    if (chessBoard.board[i][j] != null) {
                        //если цвет не совпадает с вашим и может ли фигура(фигура противоположного цвета, может нас атаковать?),
                        // которую нашли по i\j, атаковать вашего короля в точке, в котору он пытается пройти.
                        if (!chessBoard.board[i][j].getColor().equals(color) && chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } else return false;
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

        if (differenceInLine > 1 || differenceInColumn > 1) {
            return false;
        }

        if (isUnderAttack(chessBoard, toLine, toColumn)) {
            System.out.println("Угроза шаха");
            return false;
        }


        if (chessBoard.board[toLine][toColumn] != null && getColor().equals(chessBoard.board[toLine][toColumn].getColor())) {
            System.out.println("Вы пытаетесь съесть фигуру вашего цвета");
            return false;
        }

        return true;
    }

    @Override
    public String getSymbol() {
        return "K";
    }


}
