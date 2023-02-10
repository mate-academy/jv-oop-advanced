package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, Side A: %.0f units,"
                        + " Side B: %.0f units, color: %s",
                this.getClass().getSimpleName(), getArea(), length, width,
                getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return width * length;
    }
}
