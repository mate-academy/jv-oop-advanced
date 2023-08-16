package core.basesyntax;

public class Rectangle implements Figure {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.2f sq.units,"
                        + " length: %.2f units, width: %.2f units, color: %s\n",
                getArea(), length, width, color);
    }
}
