package Practice.Week.Second.TaskOne;

public class Guitar implements Soundble {

    @Override
    public void makesSounds() {
        System.out.println("E, A, D, G, B, E");
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.makesSounds();
    }


}
