import java.util.Random;
import java.util.Scanner;


public class GuessNumber {
    public static void main(String[] args) {

        //Создаем сканнер для получения данных для установки пределов и количества попыток
        Scanner console = new Scanner(System.in);

        System.out.println("Введите максимальное количество попыток ");
        int turnQuantity = console.nextInt();

        System.out.println("Введите нижний предел числа ");
        int lowerBound = console.nextInt();

        System.out.println("Введите верхний предел числа ");
        int upperBound = console.nextInt();

        //Создаем экземпляр класса Random()
        Random rand = new Random();

        //Создаем переменную типа int
        int randInt;

        //Сохраняем случайное число в переменной randInt;
        randInt = lowerBound + rand.nextInt(upperBound);

        int counter = 1;
        //создаем булеву переменную для сохранения статуса «угадал/не угадал»
        boolean status = false;
        while (counter <= turnQuantity) {

            System.out.print("Введите число: ");
            //сохраняем введённое пользователем число в переменной userInput
            int userInput = console.nextInt();

            //проверяем условие и выводим сообщения
            if (userInput == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                status = true;
                break;
            } else if (userInput > randInt) {
                System.out.println("Загаданное мною число меньше.");
                status = false;
            } else {
                System.out.println("Загаданное мною число больше.");
                status = false;
            }

            counter++;
        }
        if (status == false) {
            System.out.println("Конец игры.");
            System.out.println("Мною было загадано число: " + randInt);
        }
    }
}