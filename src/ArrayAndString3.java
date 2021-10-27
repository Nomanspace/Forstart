public class ArrayAndString3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine(); //Считывает строку из System.in
            isCorrectName = checkName(name);
            if (!isCorrectName) {
                System.out.println("Введите корректное имя!");
            } else {
                System.out.println(formatName(name));
            }
        }
    }

    private static boolean checkName(String name) {
        //Написать код здесь
    }

    private static String formatName(String name) {
        //Написать код здесь
    }

    private static void sortByLength(String[] words) {
        //Написать код здесь
    }
}
}
