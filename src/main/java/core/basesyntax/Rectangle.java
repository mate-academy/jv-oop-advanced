package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length + width;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: rectangle, area: %.2f sq.units, length: %.2f, width: %.2f, color: %s%n",
                this.getArea(), length, width, this.getColor());
    }
}
