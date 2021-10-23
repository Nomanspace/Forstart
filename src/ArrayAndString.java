/**
 * Измените код из предыдущего задания так, чтобы в случае совпадения имен пользователей (без учета регистра) выводился ответ:
 * "Выберите другое имя пользователя", а если имена не совпадают, выводится ответ: "Отличное имя!".
 * В задании используйте методы из таблицы выше.
 */

import java.util.Scanner;

public class ArrayAndString {
    public static void main(String[] args) {
        Scanner scanuser1 = new Scanner(System.in);
        Scanner scanuser2 = new Scanner(System.in);
        //String a = "Sometimes";
        //System.out.println(a.charAt(2));
        System.out.println("Введите имя1");
        String user1 = scanuser1.nextLine();
        System.out.println("Введите имя2");
        String user2 = scanuser2.nextLine();
        System.out.println("Ваши имена " + user1 + " " + user2);
        //System.out.println(a1.equals(user2));
        //System.out.println(a1.equalsIgnoreCase(user2));
        checkUserName(user1, user2);
    }

    private static void checkUserName(String user1, String user2) {

        if (user1.equalsIgnoreCase(user2)) {
            System.out.println("Выберите другое имя.");
        } else if (!user1.equalsIgnoreCase(user2)) {
            System.out.println("Ваше имя уникально.");
            System.out.println("Ваше имя пользователя " + user1 + " уникальное! Ваше имя имеет длину " + user1.length() + " символов.");
        } else {
            System.out.println("somethings get wrong.");
        }
    }

}
