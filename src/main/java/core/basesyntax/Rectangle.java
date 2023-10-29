package core.basesyntax;

public class Rectangle extends Figure {
    private final int side1;
    private final int side2;

    public Rectangle(int side1, int side2, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getArea() {
        double rectangleArea;
        rectangleArea = side1 * side2;
        return rectangleArea;
    }

    public void draw() {
        System.out.println("Figure: Rectangle, " + "area: " + getArea() + " sq.units, "
                + "side1: " + side1 + " units, " + "side2: " + side2 + " units, " + "color: "
                + getColor());
    }
}
