/**
 * Напишите программу, в которой пользователя просят ввести имя и пароль. Пароль должен быть ограничен по размеру от 8 до 15 символов.
 * В случае ввода неверного пароля программа должна запрашивать пароль снова и выводить на экран причину ошибки.
 * В случае, если пароль введен верно, программа должна выводить имя пользователя и его пароль. Удачи, и да прибудет с вами сила!
 */


package extendedmaterial.ArrAndString.programm.pr2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean passTrigger = false;
        while (!passTrigger) {
            //passTrigger !=false;
            //true && false
            //Если значение a равно true, то блок b будет выполнен. Это будет повторяться до тех пор, пока a не станет неверным.
            // Если a заменяется постоянным значением true, то a никогда не будет ложным, поэтому цикл никогда не завершится.
            System.out.println("Введите имя пользователя");
            String userName = scanner.nextLine();
            System.out.println("Введите пароль, пароль должен состоять от 8 до 15 символов");
            String userPass = scanner.nextLine();
            passTrigger = checkUserPass(userPass);
            if (!passTrigger) {
                System.out.println("Длина вашего пароля не верна");
            } else {
                System.out.println("Ваше имя пользователя " + userName);
                System.out.println("Ваш пароль " + userPass);
            }
        }
    }

    private static boolean checkUserPass(String userPass) {
        //userPass = 8 < userPass.length() < 15;
        //boolean result = 5 < userName.length() || userName.length() < 15;
        //return result;
        //boolean result = false;
        //if (5 < userPass.length() || userPass.length() < 15) {
        //boolean result = true;
        //}
        //return result;
        return (5 < userPass.length() && userPass.length() < 15);
    }
}
