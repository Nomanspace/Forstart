package figures;

public class Triangle {

    private int isoscelesLength;
    private int lengthB;

    public Triangle(int isoscelesLength, int lengthB) {

        this.isoscelesLength = isoscelesLength;
        this.lengthB = lengthB;
    }

    public int calculatingPerimeter() {

        return isoscelesLength * 2 + lengthB;
    }

    public int getIsoscelesLength() {
        return isoscelesLength;
    }

    public int getLengthB() {
        return lengthB;
    }
}
