package Practice.Week.First.HardTask;

import java.util.Arrays;
import java.util.Objects;

public class TicTacToe {
    String[][] ticTacToeBoard;
    //String playerX;
    //String player0;
    String currentPlayer;

    public TicTacToe() {
        newGame();
        printBoard();
    }

    public static void main(String[] args) {
        TicTacToe board = new TicTacToe();
        System.out.println(board.makeMove(0, 0));
        System.out.println(board.makeMove(0, 2));
        System.out.println(board.makeMove(1, 0));
        System.out.println(board.makeMove(1, 2));
        System.out.println(board.makeMove(2, 0));
        System.out.println(board.makeMove(0, 2));
        System.out.println(board.makeMove(2, 2));
        System.out.println(board.makeMove(2, 1));
    }

    //ничего не возвращающий метод, должен создать новую игру;
    void newGame() {
        ticTacToeBoard = new String[][]{{"-", "-", "-"},
                {"-", "-", "-"},
                {"-", "-", "-"}};
        currentPlayer = "X";
    }

    void printBoard() {
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[i].length; j++) {
                System.out.print("[" + ticTacToeBoard[i][j] + "]");
            }
            System.out.println();
        }
    }

    //метод должен вернуть двумерный массив — поле игры;
    String[][] getField() {
        return ticTacToeBoard;
    }

    //принимающий два параметра — ряд и столбик, куда игрок хочет сделать ход.
    //2 Если ход невозможен (клетка уже занята), то метод должен вернуть строку вида {Cell x, y is already occupied}.
    //1 Если же ход возможен, то в поле следует поставить X или 0 (зависит от того, кто сейчас ходил), и вернуть строку Move completed если после этого хода игра не заканчивается.
    //3Если же этим ходом победил один из игроков, то метод должен вернуть строку вида {Player X/0 won}.- нужен метод чек гейм
    //4Если же после этого хода свободных клеток не осталось, а победителя нет, то метод должен вернуть Draw. проверить массив на свободные поля
    //5Если игра уже завершена (выявлен победитель или ничья), но кто-то хочет походить дальше, то метод должен вернуть Game was ended. как - то отталкиваться от булевой переменной в ифе победителя или использовать метод чек гейм
    String makeMove(int y, int x) {
        String gameStatus = checkGame();
        //String endGame = checkGame();
        if (gameStatus != null) {
            return "Game was ended";
        }
        if (ticTacToeBoard[y][x].equals(reversPlayer()) || ticTacToeBoard[y][x].equals(currentPlayer)) {
            return "Cell " + x + ", " + y + " is already occupied";
        }
        System.out.println("Отображаем ход игрока " + currentPlayer + " следующий игрок " + reversPlayer());
        if (ticTacToeBoard[y][x].equals("-")) {
            ticTacToeBoard[y][x] = currentPlayer;
            //currentPlayer = currentPlayer.equals("X") ? "0" : "X";
            printBoard();
            gameStatus = checkGame();
            //System.out.println(checkGame());
            if (gameStatus != null) {
                if (gameStatus.equals("X")) {
                    //System.out.println("Победитель " + checkGame());
                    return "Победитель " + checkGame();
                } else if (gameStatus.equals("0")) {
                    return "Победитель " + checkGame();
                }
                //if (gameStatus == null) {
                //return "Draw";
                // }
                else return "Draw";
            }
        }
        changePlayer();
        return "Move completed";
    }

    String changePlayer() {
        return currentPlayer = currentPlayer.equals("X") ? "0" : "X";
    }

    String reversPlayer() {
        String reversCurrentPlayer = "";
        if (currentPlayer.equals("X"))
            reversCurrentPlayer = "0";
        else if (currentPlayer.equals("0")) {
            reversCurrentPlayer = "X";
        }
        return reversCurrentPlayer;
    }

    // метод должен определить есть ли победитель в игре, если да,
    // то вернуть X/0 в зависимости от того, кто победил, если победителя нет,
    // то метод должен вернуть D (ничья), если игра еще продолжается, то вернуть строку null
    String checkGame() {
        //пишем проверку на 3 в ряду. 3 фором проверка на 3 в столбик
        for (int i = 0; i < 3; ) {
            boolean winnerFlagStolbi = true;
            boolean winnerFlag = true;
            for (int j = 0; j < 3; j++) {
                if (ticTacToeBoard[i][j].equals(reversPlayer()) || ticTacToeBoard[i][j].equals("-"))
                    winnerFlag = false;
            }
            if (winnerFlag) {
                return currentPlayer;
            }
            //за счет входа в J цикл, он будет крутиться быстрее,чем i цикл, за счет чего у нас будут меняться подмассивы с остановкой на каком-то индексе i,
            // по итогу мы будем перескакивать все следующие индексы и сравнивать как бы столбиками.
            for (int j = 0; j < 3; j++) {
                if (ticTacToeBoard[j][i].equals(reversPlayer()) || ticTacToeBoard[j][i].equals("-")) {
                    winnerFlagStolbi = false;
                }
            }
            if (winnerFlagStolbi) {
                return currentPlayer;
            }
            i++;
        }
        //по диагонали
        boolean winnerFlagDiag = true;
        for (int i = 0, j = 0; i < 3 && j < 3; i++, j++) {
            if (ticTacToeBoard[i][j].equals(reversPlayer()) || ticTacToeBoard[i][j].equals("-")) {
                winnerFlagDiag = false;
            }
        }
        if (winnerFlagDiag) {
            System.out.println("победилда по диагонали");
            return currentPlayer;
        }
        //зеркалим диагональ
        boolean winnerFlagReflectDiag = true;
        for (int i = 0, j = 2; i < 3 && j >= 0; i++, j--) {
            if (ticTacToeBoard[i][j].equals(reversPlayer()) || ticTacToeBoard[i][j].equals("-")) {
                winnerFlagReflectDiag = false;
            }

        }
        if (winnerFlagReflectDiag) {

            return currentPlayer;
        }

        //если код дошел сюда,значит у нас нет победителя,а значит нет свободных полей.
        boolean winnerFlagDraw = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ticTacToeBoard[i][j].equals("-")) {
                    winnerFlagDraw = false;
                }
            }
        }
        if (winnerFlagDraw) return "Draw";
        return null;
    }
}

