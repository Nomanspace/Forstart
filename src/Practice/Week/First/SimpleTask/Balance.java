package Practice.Week.First.SimpleTask;

public class Balance {
    static int rightBowlOfScales = 0;
    static int leftBowlOfScales = 0;

    public static void main(String[] args) {
        System.out.println(getSituation());
        //System.out.println();
        //getSituation(leftBowlOfScales, rightBowlOfScales);

        addLeft(10);
        System.out.println(Balance.getSituation());

        addRight(20);
        System.out.println(getSituation());
    }

    static void addRight(int plusRight) {
        rightBowlOfScales = rightBowlOfScales + plusRight;
    }

    static void addLeft(int plusLeft) {
        leftBowlOfScales = leftBowlOfScales + plusLeft;
    }

    static String getSituation() {
        if (leftBowlOfScales == rightBowlOfScales)
            return "=";
        else if (leftBowlOfScales > rightBowlOfScales)
            return "L";
        else return "R";

    }
}
