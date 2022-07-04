package Practice.Week.First.MediumTask;

import java.util.Arrays;

public class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    int[] even(int[] mass) {
        int evenIndexCounter = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 == 0) {
                evenIndexCounter++;
            }
        }
        int[] evenArray = new int[evenIndexCounter];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if(mass[i] % 2 == 0) {
                evenArray[j] = mass[i];
                j++;
            }
        }
        return evenArray;
    }

    int[] odd(int[] mass) {
        int oddIndexCounter = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] % 2 != 0) {
                oddIndexCounter++;
            }
        }
        int[] oddArray = new int[oddIndexCounter];
        for (int i = 0, j = 0; i < mass.length; i++) {
            if(mass[i] % 2 != 0) {
                oddArray[j] = mass[i];
                j++;
            }
        }
        return oddArray;
    }

    public static void main(String[] args) {
        Separator separator = new Separator(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println(Arrays.toString(separator.even(separator.array)));
        System.out.println(Arrays.toString(separator.odd(separator.array)));
    }

}
