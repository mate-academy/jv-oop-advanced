package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width, Color color) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, Color color) {
        this("Rectangle", length, width, color);
    }

    @Override
    public double getArea() {
        return Math.round(length * width * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.2f sq.units, "
                        + "length: %.2f units, width: %.2f units, color: %s",
                getName(), getArea(), length, width, getColor()));
    }
}
