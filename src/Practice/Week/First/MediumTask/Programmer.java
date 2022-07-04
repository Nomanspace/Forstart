package Practice.Week.First.MediumTask;

public class Programmer {
    static String name;
    static String company;

    static String position;

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    static String getPosition() {
        return position;
    }

    static void work() {
        if (position == null) {
            position = "intern";
        } else if (position.equals("intern")) {
            position = "junior";
        } else if (position.equals("junior")) {
            position = "middle";
        } else if (position.equals("middle")) {
            position = "senior";
        } else if (position.equals("senior")) {
            position = "lead";
        }
    }

    public static void main(String[] args) {
        System.out.println(position);
        work();
        System.out.println(position);
        work();
        System.out.println(position);
        work();
        System.out.println(position);
        work();
        System.out.println(position);

    }

}
