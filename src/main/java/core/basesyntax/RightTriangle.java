package core.basesyntax;

public class RightTriangle extends Figure {
    int side1;
    int side2;

    public RightTriangle(int side1, int side2, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return (side1 * side2 / 2);
    }

    @Override
    public void draw() {
        System.out.println("Triangle, area: " + getArea() + ", color: " + color
                + ", side1: " + side1 + ", side2: " + side2);
    }
}
