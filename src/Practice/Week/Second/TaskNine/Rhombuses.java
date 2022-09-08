package Practice.Week.Second.TaskNine;

import static java.lang.Math.*;

public class Rhombuses extends Quadrangle implements Figure {
    double alpha;
    double beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        // left bottom angle in degrees
        this.alpha = alpha;
        // left upper angle in degrees
        this.beta = beta;

    }

    // we should get the largest diagonal of the rhombus
    @Override
    public double getLargeDiagonal() {
        double sideAndObtuseAngle = a * sqrt(2 - 2 * cos(toRadians(beta)));
        double sideAndAcuteAngle = a * sqrt(2 - 2 * cos(toRadians(alpha)));
        return max(sideAndObtuseAngle, sideAndAcuteAngle);
    }

    @Override
    public String getColor() {
        return color;
    }

    //search height using sin
    @Override
    public double getHeight() {
        return a * sin(toRadians(alpha));
    }

    //area is a(side) * h(height), we found h: a * alpha
    @Override
    public double area() {
        return b * getHeight();
    }

    //gettter
    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }
}