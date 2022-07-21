package Practice.Week.First.HardTask;

import java.util.Arrays;
import java.util.Objects;

public class WarShipBattleField {
    //String playerOne;
    //String playerTwo;
    private String[][] field;

    public static void main(String[] args) {
        WarShipBattleField board = new WarShipBattleField();
        board.getField();
        board.printField(board.field);
        //board.shoot(0, 0, "m");
        board.shoot(2, 0, "h");
        //board.shoot(6, 9, "h");
        board.shoot(2, 1, "h");
        board.shoot(2, 2, "d");
        board.printField(board.field);
    }

    String[][] getField() {
        field = new String[10][10];
        for (int i = 0; i < field.length; i++) {
            Arrays.fill(field[i], " ");
        }
        return field;
    }

    void printField(String[][] printBattlefield) {
        System.out.println("    0    1    2    3    4    5    6    7    8    9");
        for (int i = 0; i < printBattlefield.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < printBattlefield[i].length; j++) {
                /*if (field[i][j].equals("d")) {
                    if (field[i][j - 1].equals("h")) {
                        field[i][j + 1] = "#";

                    }
                }*/

                printBattlefield[i][j] = field[i][j];
                System.out.print("[ " + printBattlefield[i][j] + " ]");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("    0    1    2    3    4    5    6    7    8    9");
        for (int i = 0; i < printBattlefield.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < printBattlefield[i].length; j++) {
                printBattlefield[i][j] = check(i, j);
                System.out.print("[ " + printBattlefield[i][j] + " ]");
            }
            System.out.println();
        }
        System.out.println();
    }

    void shoot(int line, int column, String issue) {
        if (issue.equals("m")) {
            field[line][column] = "m";
        } else if (issue.equals("h")) {
            field[line][column] = "h";
        } else if (issue.equals("d")) {
            field[line][column] = "d";
            sink(line, column);
        } else System.out.println("You enter wrong char");
    }

    String check(int line, int column) {

        if (field[line][column].equals("m")) {
            return "#";
        } else if (field[line][column].equals("h")) {
            return "x";
        } else if (field[line][column].equals("#")) {
            return "#";
        } else if (field[line][column].equals("D")) {
            return "x";
        }
        return ".";
    }

    private void sink(int line, int column) {
        int[][] commands = new int[][]  // массив всех возможных полей,
                //которые надо поменять
                {{line - 1, column}, {line + 1, column}, {line, column - 1}, {line, column + 1},
                        {line - 1, column - 1}, {line - 1, column + 1}, {line + 1, column - 1}, {line + 1, column + 1}};

        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals(".")) {
                field[i[0]][i[1]] = "#"; // если координаты лежат внутри
                //поля и в них не стреляли, то меняем их
            }
        }
        field[line][column] = "D"; // после того, как обработали это
        //поле, заменяем его на потопленное

        for (int[] i : commands) {
            if (0 <= i[0] && i[0] <= 9 && 0 <= i[1] && i[1] <= 9 && field[i[0]][i[1]].equals("h")) {
                sink(i[0], i[1]); // и ищем следующее, прилежащее к
                //нашему полю и так же обрабатываем его
            }
        }
        // таким образом мы рекурсивно обойдем все прилежащие поля, к
        //полю, которое подбили и прилежащие к ним.
    }
}



