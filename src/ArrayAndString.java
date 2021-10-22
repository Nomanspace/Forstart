/**
 * Измените код из предыдущего задания так, чтобы в случае совпадения имен пользователей (без учета регистра) выводился ответ:
 * "Выберите другое имя пользователя", а если имена не совпадают, выводится ответ: "Отличное имя!".
 * В задании используйте методы из таблицы выше.
 */


public class ArrayAndString {
    public static void main(String[] args) {
        //String a = "Sometimes";
        //System.out.println(a.charAt(2));
        String user1 = "Иван Иванов";
        String user2 = "иван иванов";
        //System.out.println(a1.equals(user2));
        //System.out.println(a1.equalsIgnoreCase(user2));
        checkUserName(user1, user2);
    }

    private static void checkUserName(String user1, String user2) {

        if (user1.equalsIgnoreCase(user2)) {
            System.out.println("Выберите другое имя");
        } else if (!user1.equalsIgnoreCase(user2)) {
            System.out.println("Отличное Имя");
        } else {
            System.out.println("somethings get wrong");
        }
    }

}
