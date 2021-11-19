/**
 * Создайте массив и инициализируйте его следующими значениями: 5, 24, 3, 66, 38, 16, 27.
 * Проведите сортировку массива и выведите третий элемент массива. Чему он равен?
 */

package extendedmaterial.ArrAndString.programm.pr1;

import java.util.Arrays;

public class Lesson1 {
    public static void main(String[] args) {
        int[] array = {5, 24, 3, 66, 38, 16, 27};
        int[] arraysorted;
        Arrays.sort(array);
       // arraysorted = array;
        //System.out.println(Arrays.toString(arraysorted));
        //for (int i = 0; i < arraysorted.length; i++) {
            System.out.println(array[2]);
           // break;
        //}
    }
}
