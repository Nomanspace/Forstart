package Practice.Week.First.MediumTask;

import java.util.Arrays;

public class ToLine {
    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    int[] resize(int[][] mass) {
        int[] toLineArray;
        int sumOfArrayElements = 0;

        /*for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length;j++) {
                sumOfArrayElements = sumOfArrayElements + i;
            }
        }*/

        for (int i = 0; i < mass.length; i++) {
            sumOfArrayElements = sumOfArrayElements + mass[i].length;
        }

        //toLineArray = new int[mass.length * sumOfArrayElements];
        System.out.println(sumOfArrayElements);
        toLineArray = new int[sumOfArrayElements];
        System.out.println(toLineArray.length);

        for (int i = 0; i < toLineArray.length; ) {
            for (int j = 0; j < mass.length; j++) {
                for (int l = 0; l < mass[j].length; l++) {
                    toLineArray[i] = mass[j][l];
                    i++;
                }
            }
        }
        return toLineArray;
    }

    public static void main(String[] args) {
        ToLine a = new ToLine(new int[][]{{1, 2}, {3, 4}, {5, 6}});

        System.out.println(Arrays.toString(a.resize(a.data)));
    }
}
