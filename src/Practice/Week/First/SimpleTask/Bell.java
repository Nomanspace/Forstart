package Practice.Week.First.SimpleTask;

public class Bell {
    static int count = 0;

    static void sound() {
        if (count % 2 == 0) {
            System.out.println("ding");
            count++;
        } else {
            System.out.println("dong");
            count++;
        }
    }

    public static void main(String[] args) {
        sound();
        sound();
        sound();
        sound();
    }
}
