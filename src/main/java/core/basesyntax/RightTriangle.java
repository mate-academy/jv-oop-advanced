package core.basesyntax;

public class RightTriangle implements Figure {
    int side1;
    int side2;
    String color;

    public RightTriangle(int side1, int side2, String color) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1 * side2 / 2.0);
    }

    @Override
    public void draw() {
        System.out.println("Triangle, area: " + getArea() + " sq. units, color: " + color
                + ", side1: " + side1 + " units, side2: " + side2 + " units");
    }
}
