package Practice.Week.Second.TaskOne;

public class Transport implements Soundble{

    @Override
    public void makesSounds() {
        System.out.println("Beeep!");
    }

    public static void main(String[] args) {
        Transport transport = new Transport();
        transport.makesSounds();
    }
}
