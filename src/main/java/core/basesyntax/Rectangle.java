package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(Figure.RECTANGLE.name(), color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, Side A: %.0f units,"
                        + " Side B: %.0f units, color: %s",
                getType(), getArea(), length, width, getColor());
    }

    @Override
    public double getArea() {
        return width * width;
    }
}
