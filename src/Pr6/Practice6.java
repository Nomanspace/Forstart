package Pr6;

/**
 * Необходимо закомментировать некоторые из строк так, чтобы переменная a приняла значение 18. Вывести её в консоль 20 раз.
 */


public class Practice6 {
    public static void main(String[] args) {
        int a = 4, b = 3, c = 2;
        b = b + c;
        System.out.println("b ravno " + b);
        //  a = a * b;
        //  c = a - c;
        // a = a + b;
        a = a - b;
        System.out.println("a ravno " + a);
        c = a + b;
        System.out.println("c ravno " + c);
        // b = c / a;
        a = b + c;
        System.out.println("a ravno " + a);
        a = a + c + b;
        System.out.println("равно " + a);
        // Напишите здесь свой код
        for (int i = 1; i <= 20; i++) {
            System.out.println("Итерация № " + i + " a ravno= " + a);
        }
    }
}


