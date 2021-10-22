/**
 * Написать код расчета периметра равнобедренного треугольника, квадрата, окружности и вывести эти значения в консоль.
 * Параметры для расчета задаются статическими переменными, без ввода с клавиатуры.
 * <p>
 * Для расчета периметра фигуры необходимо создать свой класс.
 */

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //triangle
        //square
        //circle
        char triangle = scanner.next().charAt(0);
        //char b = 'b';
        if (triangle == 'a') {
            // perimetrTriangle();
        } else {
            System.out.println("что-то пошло не так");
        }
    }

    //static class Triangle {

    static int perimetrTriangle(int length, int pT) {
        /*static*/
        //int length;
        //length = length1;
        Scanner scanpT = new Scanner(System.in);
        System.out.println("введите length ");
        length = scanpT.nextInt();
        return pT = length * 3;
        //return pT;
    }
    //  }

    //static class Square {

    static int perimetrSqare(int a) {
        /*static*/
        //int a;
        // a = a1;
        Scanner scanpS = new Scanner(System.in);
        a = scanpS.nextInt();
        System.out.println("Введите a " + a);
        int pS = a * 4;
        return pS;
    }
    //  }

    // static class Circle {

    static double perimetrCicrle(/*double PI*/ int radius) {
        /*static*/
        double PI = 3.14159;
        //PI = PI1;
        Scanner scanpC = new Scanner(System.in);
        System.out.println("Введите " + radius);
        radius = scanpC.nextInt();
        double pC = 2 * PI * radius;
        return pC;
    }
    //}
}

