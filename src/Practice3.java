import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
//Создаем экземпляр класса Random()
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String win = "you win";


        //Создаем переменную типа int
        int randInt;

        //Создаем переменную под количество попыток
        System.out.println("За сколько попыток угадаешь?");
        int diffselect = scanner.nextInt();

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(10) + 1;
        System.out.println("кожаный мешок, я загадал " + randInt);

        //создаем пользовательскую переменную
        System.out.println("введите своё число");
        int userenter = scanner.nextInt();

        //userenter == randInt ? System.out.println(win) : System.out.println(loose);
        for (int i = 0; i < diffselect; i++) {
            if (userenter == randInt) {
                System.out.println(win);
                break;
            } else if (userenter > randInt) {
                System.out.println("Мое число меньше, кожаный мешок");
            } else if (userenter < randInt) {
                System.out.println("Мое число меньше,кожаный мешок");
            } else {
                System.out.println("Попробуй еще!");
            }
        }
    }
}
