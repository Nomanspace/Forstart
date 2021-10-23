package figures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите равнобедренную сторону");

        int isoscelesLength = scanner.nextInt();

        System.out.println("Введите оставшуюся сторону (основание треугольника)");

        int otherLength = scanner.nextInt();

        Triangle triangle = new Triangle(isoscelesLength, otherLength);

        System.out.println("Периметр равнобедренного треугольника со сторонами: " + triangle.getIsoscelesLength() + " "
                + triangle.getLengthB() + " равен: " + triangle.calculatingPerimeter());

        /**
         * <Тип переменной> <название переменной> = new <имя класса> (здесь производится вызов конструктора)
         */
        Circle circle = new Circle(4);

        double result = circle.calculatingPerimeter(3.14);

        System.out.println("Перимеметр круга: " + result);

    }
}
