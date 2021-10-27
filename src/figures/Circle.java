package figures;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculatingPerimeter(double pi) {
        double count = 2 * pi * radius;
        return count;
    }

}
