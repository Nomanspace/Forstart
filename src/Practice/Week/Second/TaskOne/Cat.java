package Practice.Week.Second.TaskOne;

public class Cat implements Soundble{
    @Override
    public void makesSounds() {
        System.out.println("Meow!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makesSounds();
    }
}

