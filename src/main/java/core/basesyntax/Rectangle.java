package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA, sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        super.color = color;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle sides are " + sideA + " and " + sideB + ", rectangle color is " + color);
    }
}
