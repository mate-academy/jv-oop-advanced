package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double side1, double side2) {
        super(color);
        this.firstSide = side1;
        this.secondSide = side2;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: Rectangle, area: %.1f sq.units,"
                + "side1: %.1f units, side2: %.1f units, color: %s\n",
                getArea(), firstSide, secondSide, getColor());
    }
}
