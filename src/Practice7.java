/**
 * Написать код расчета периметра равнобедренного треугольника, квадрата, окружности и вывести эти значения в консоль.
 * Параметры для расчета задаются статическими переменными, без ввода с клавиатуры.
 * <p>
 * Для расчета периметра фигуры необходимо создать свой класс.
 */

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        // Perimetr triangle =
        //Perimetr square =
        // Perimetr circle =
    }

    static class Triangle {
        Scanner scanpT = new Scanner(System.in);
        int length;
        int pT = length * 3;

    }

    static class Square {
        Scanner scanpS = new Scanner(System.in);
        int a;
        int pS = a * 4;
    }

    static class Circle {
        double PI = 3.14159;

        static double perimetrCicrle(double PI, int radius) {
            Scanner scanpC = new Scanner(System.in);
            System.out.println("Введите " + radius);
            radius = scanpC.nextInt();
            double pC = 2 * PI * radius;
            return pC;
        }
    }
}
