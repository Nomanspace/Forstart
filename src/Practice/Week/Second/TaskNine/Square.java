package Practice.Week.Second.TaskNine;

import static java.lang.Math.*;

public class Square extends Quadrangle implements Figure {

    public Square(int a, String color) {
        super(a, a, color);
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
        return a * sqrt(2);//sqrt(pow(a, 2) + pow(a, 2));
    }

    @Override
    public double getHeight() {
        return a;
    }

    @Override
    public String getColor() {
        return color;
    }
}
