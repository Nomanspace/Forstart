package Practice.Week.Second.TaskNine;

import static java.lang.Math.*;

public class Rectangle extends Quadrangle implements Figure {

    public Rectangle(int a, int b, String color) {
        super(a, b, color);
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getLargeDiagonal() {
        return sqrt(pow(a, 2) + pow(b, 2));
    }

    @Override
    public double getHeight() {
        return min(a, b);
    }

    @Override
    public String getColor() {
        return color;
    }
}
