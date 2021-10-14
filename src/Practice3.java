import java.util.Random;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
//Создаем экземпляр класса Random()
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        String win = "you win";
        String loose = "you loose";

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;
        randInt = rand.nextInt(10) + 1;
        System.out.println("кожанный мешок, я загадал " + randInt);

        //создаем пользовательскую переменную
        System.out.println("введите своё число");
        int userenter = scanner.nextInt();

        //userenter == randInt ? System.out.println(win) : System.out.println(loose);

        if (userenter == randInt) {
            System.out.println(win);
        } else {
            System.out.println(loose);
        }
    }
}
