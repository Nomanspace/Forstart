/**
 * Прошло соревнование среди 5 участников: Саша, Игорь, Миша, Коля и Владимир, по 5 различным дисциплинам. Организаторами
 * был создан двухмерный массив: каждая i-ая строка — это количество полученных баллов i-го игрока.
 * Задание: вывести одномерный массив в виде "<Имя игрока>  <сумма баллов>".
 */

package extendedmaterial.ArrAndString.programm.pr3;

public class Lesson3 {
    public static void main(String[] args) {
        int i,j;
        String[] result = new String[5];
        // пустой массив на 5 элементов
        //{null,null,null,null,null}
        int[][] points = {
                {4, 3, 2, 5, 1},
                //1ый массив
                {3, 4, 4, 6, 2},
                //второй массив
                {2, 5, 4, 3, 2},
                //3ий массив
                {8, 4, 2, 0, 4},
                //4 массив
                {4, 4, 3, 2, 9},
                //5 массив
        };
        //int[] sumPoints = new int[5];
        int sumPoints = 0;
        //пустой числовой массив на 5 элементов
        //{0,0,0,0,0}
        String[] names = {"Alex","Igor","Michael","Nicolay","Vladimir"};
        for (i=0; i < names.length; i++) {
            for (j = 0; j < points[i].length; j++) {
                sumPoints += points[i][j];
                //sumPoints [i] += points[i][j];
                //sumPoints [i] = sumPoints [i] + points[i][j];
                //к каждому имени из массива имен, присвоили все числа из массива баллов
                //вернее по кол-воу имен, а их пять,мы создали 5 массивов,в которых просуммировали все значения внутри каждого числового массива
            }
            result[i] = names[i] + " " + sumPoints; //{15, 19, 16, 18, 22}
            //от каждой итерации берем имя по индексу и сумму чисел для каждой итерации j
            System.out.println(result[i]);
            sumPoints = 0;
        }

    }
}
