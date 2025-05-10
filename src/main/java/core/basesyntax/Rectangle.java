package core.basesyntax;

public class Rectangle extends ColoredFigure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq.units,"
                        + " length: %.2f units, width: %.2f units, color: %s\n",
                getArea(), length, width, getColor());
    }
}
