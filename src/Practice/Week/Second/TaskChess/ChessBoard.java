package Practice.Week.Second.TaskChess;

public class ChessBoard {
    public ChessPiece[][] board = new ChessPiece[8][8];
    String nowPlayer;

    /*
       0   1   2   3   4   5   6   7
    { { } {H} { } { } { } { } { } { } } 0
    { { } { } { } { } { } { } { } { } } 1
    { { } { } { } { } { } { } { } { } } 2
    { { } { } { } { } { } { } { } { } } 3
    { { } { } { } { } { } { } { } { } } 4
    { { } { } { } { } { } { } { } { } } 5
    { { } { } { } { } { } { } { } { } } 6
    { { } { } { } { } { } { } { } { } } 7


     */
    public ChessBoard(String nowPlayer) {
        this.nowPlayer = nowPlayer;
    }

    public String nowPlayerColor() {
        return this.nowPlayer;
    }

    public boolean moveToPosition(int startLine, int startColumn, int endLine, int endColumn) {
        //передаем аргументы стартовых позиций на проверку полученных из параметров объявленных в сигнатуре метода
        //если проверка стартовых позиций пройдена то. такая клетка существует?
        if (!(checkPos(startLine) && checkPos(startColumn))) {
            System.out.println("Недопустимые координаты");
            return false;
        }

        if (!(checkPos(endLine) && checkPos(endColumn))) {
            System.out.println("Недопустимые координаты");
            return false;
        }
        // проверяем, что не перезапишем другие клетки нул значением.
        if (board[startLine][startColumn] == null) {
            System.out.println("Исходная клетка пуста");
            return false;
        }
        // проверяем, что стартовые координаты неравны конечным, тем самым предотвращаем ходьбу на месте.
        if (startLine == endLine && startColumn == endColumn) {
            System.out.println("Бег на месте запрещен");
            return false;
        }
        //если текущий цвет игрока равен цвету в указанных координатах вернуть фолз. иф работает только если проверка не пройдена, цвет не совпал.
        //это проверка на то, что не пытается ли текущий игрок походить не своей фигурой?
        //если игрок ходит своей фигурой т.е белый игрок == белая фигура,то тру

        if (!nowPlayerColor().equals(board[startLine][startColumn].getColor())) {
            System.out.println("вы пытаетесь походить фигурой не вашего цвета");
            return false;
        }

        //у объекта по стартовым(заданным) координатам, мы вызываем метод, который принадлежит этому объекту, в котором описаны правила ходьбы фигуры
        if (!board[startLine][startColumn].canMoveToPosition(this, startLine, startColumn, endLine, endColumn)) {
            System.out.println("Что не прошло проверку в canMoveToPosition");
            return false;
        }
        // if piece can move, we moved a piece если можем ходить, то в конечных координатах массива сохраняем нашу фигуру.
        board[endLine][endColumn] = board[startLine][startColumn];
        //очищаем стартовые координаты
        board[startLine][startColumn] = null; // set null to previous cell
        // меняем игрока
        this.nowPlayer = this.nowPlayerColor().equals("White") ? "Black" : "White";
        System.out.println("chess board ok test");
        System.out.println();
        return true;
    }

    //проверка позиции в пределах массива
    public boolean checkPos(int pos) {
        return pos >= 0 && pos <= 7;
    }

    public void printBoard() { //print board in console
        System.out.println("Turn " + nowPlayer);
        System.out.println();
        System.out.println("Player 2(Black)");
        System.out.println();
        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7");

        for (int i = 7; i > -1; i--) {
            System.out.print(i + "\t");
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == null) {
                    System.out.print(".." + "\t");
                } else {
                    System.out.print(board[i][j].getSymbol() + board[i][j].getColor().substring(0, 1).toLowerCase() + "\t");
                }
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("\t0\t1\t2\t3\t4\t5\t6\t7");

        System.out.println("Player 1(White)");
    }

    public boolean castling0() {
        // смотрим,что игрок соверашающий рокировку делает это своим цветом
        if (nowPlayer.equals("White")) {
            //смотрим что для рокировки в левом углу по указанным координатам есть все фигуры
            if (board[0][0] == null || board[0][4] == null) return false;
            //проверяем, что по указанным координатам стоят отвечающие правилам фигуры
            if (board[0][0].getSymbol().equals("R") && board[0][4].getSymbol().equals("K") && // check that King and Rook
                    //проверяем,что клетки между фигурами для рокировки свободны
                    board[0][1] == null && board[0][2] == null && board[0][3] == null) {
                // проверяем, что фигуры одной фракции
                if (board[0][0].getColor().equals("White") && board[0][4].getColor().equals("White") &&
                //проверяем переключен ли флаг чек для ладьи и короля, должен быть тру, что бы рокировка прошла
                        board[0][0].check && board[0][4].check &&
                        //если угрозы нет,то вернет фолз,а нам для входа в тело,нужен тру, так что инвертируем
                        !new King("White").isUnderAttack(this, 0, 2)) { // check that position not in under attack
                    board[0][4] = null;
                    board[0][2] = new King("White");   // move King
                    board[0][2].check = false;
                    board[0][0] = null;
                    board[0][3] = new Rook("White");   // move Rook
                    board[0][3].check = false;
                    nowPlayer = "Black";  // next turn
                    return true;
                } else return false;
            } else return false;
        } else {
            if (board[7][0] == null || board[7][4] == null) return false;
            if (board[7][0].getSymbol().equals("R") && board[7][4].getSymbol().equals("K") && // check that King and Rook
                    board[7][1] == null && board[7][2] == null && board[7][3] == null) {              // never moved
                if (board[7][0].getColor().equals("Black") && board[7][4].getColor().equals("Black") &&
                        board[7][0].check && board[7][4].check &&
                        !new King("Black").isUnderAttack(this, 7, 2)) { // check that position not in under attack
                    board[7][4] = null;
                    board[7][2] = new King("Black");   // move King
                    board[7][2].check = false;
                    board[7][0] = null;
                    board[7][3] = new Rook("Black");   // move Rook
                    board[7][3].check = false;
                    nowPlayer = "White";  // next turn
                    return true;
                } else return false;
            } else return false;
        }
    }

    public boolean castling7() {
        if (nowPlayer.equals("White")) {
            if (board[0][7] == null || board[0][4] == null) return false;
            if (board[0][7].getSymbol().equals("R") && board[0][4].getSymbol().equals("K") && // check that King and Rook
                    board[0][6] == null && board[0][5] == null) {                             // never moved
                if (board[0][7].getColor().equals("White") && board[0][4].getColor().equals("White") &&
                        board[0][7].check && board[0][4].check &&
                        !new King("White").isUnderAttack(this, 0, 6)) { // check that position nit in under attack
                    board[0][4] = null;
                    board[0][6] = new King("White");   // move King
                    board[0][6].check = false;
                    board[0][7] = null;
                    board[0][5] = new Rook("White");   // move Rook
                    board[0][5].check = false;
                    nowPlayer = "Black";  // next turn
                    return true;
                } else return false;
            } else return false;
        } else {
            if (board[7][7] == null || board[7][4] == null) return false;
            if (board[7][7].getSymbol().equals("R") && board[7][4].getSymbol().equals("K") && // check that King and Rook
                    board[7][6] == null && board[7][5] == null) {                             // never moved
                if (board[7][7].getColor().equals("Black") && board[7][4].getColor().equals("Black") &&
                        board[7][7].check && board[7][4].check &&
                        !new King("Black").isUnderAttack(this, 7, 6)) { // check that position not in under attack
                    board[7][4] = null;
                    board[7][6] = new King("Black");   // move King
                    board[7][6].check = false;
                    board[7][7] = null;
                    board[7][5] = new Rook("Black");   // move Rook
                    board[7][5].check = false;
                    nowPlayer = "White";  // next turn
                    return true;
                } else return false;
            } else return false;
        }
    }
}



