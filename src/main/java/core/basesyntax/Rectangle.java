package core.basesyntax;

public class Rectangle extends Figure {
    private double side1;
    private double side2;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Rectangle, area: %.1f sq.units,"
                + "side1: %.1f units, side2: %.1f units, color: %s\n",
                getArea(), side1, side2, super.getColor());
    }
}
