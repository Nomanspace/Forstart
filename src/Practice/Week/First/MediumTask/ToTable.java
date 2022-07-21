package Practice.Week.First.MediumTask;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ToTable {
    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        //кол-во подмассивов
        this.x = x;
        //кол-во элементов в подмассиве
        this.y = y;
    }

    int[][] resize(int @NotNull [] mass, int x, int y) {
        int[][] toTableArray = new int[x][y];
        for (int i = 0; i < mass.length; ) {//1
            for (int j = 0; j < toTableArray.length; j++) {//0
                for (int l = 0; l < toTableArray[j].length; l++) {//0
                    toTableArray[j][l] = mass[i];
                    i++;
                }
            }
        }
        return toTableArray;
    }

    public static void main(String[] args) {
        ToTable toTable = new ToTable(new int[]{1, 2, 3, 4, 5, 6}, 3, 2);
        System.out.println(Arrays.deepToString(toTable.resize(toTable.data, toTable.x, toTable.y)));
    }

}
