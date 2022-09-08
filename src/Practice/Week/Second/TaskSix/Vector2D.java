package Practice.Week.Second.TaskSix;

import static java.lang.Math.*;

public class Vector2D extends Vector {
    public Vector2D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1 = 0, x2, y2, z2 = 0);
    }

    public static void main(String[] args) {
        Vector2D vector2D = new Vector2D(2, 4, 0, 3, 6, 0);
        System.out.println(vector2D.getScalarProduct(vector2D));
    }

    //возвращающий длину вектора
    @Override
    public double getLength() {
        return sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));
    }

    //возвращающий строку (координаты вектора через пробел)
    @Override
    public String getVectorCords() {
        return (x1 - x2) + " " + (y1 - y2);
    }

    // (скалярное произведение), возвращающий скалярное произведение векторов (вещественное (double) число)
    public double getScalarProduct(Vector2D vector2D) {
        String cords = getVectorCords();
        String cords2 = vector2D.getVectorCords();
        double leftSide = Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]);
        double rightSide = Integer.parseInt(cords2.split(" ")[1]) * Integer.parseInt(cords.split(" ")[1]);
        double result = leftSide + rightSide;
        //return Integer.parseInt(cords.split(" ")[0]) * Integer.parseInt(cords2.split(" ")[0]) + Integer.parseInt(cords2.split(" ")[1]) *
        //Integer.parseInt(cords.split(" ")[1]);
        return result;
    }

    // возвращающий вещественное значение — косинус угла (в радианах) между векторами, если они не нулевые, иначе метод должен вернуть -2.0.
    public double getAngle(Vector2D vector2D) {
        if (getLength() != 0 && vector2D.getLength() != 0) {
            return getScalarProduct(vector2D) / (this.getLength() * vector2D.getLength());
        } else return -2.0;
    }
}
