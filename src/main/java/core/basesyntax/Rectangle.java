package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double width;
    private final double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String draw() {
        return String.format("Figure: rectangle, area: %.2f sq.units, "
                        + "width: %.2f units, length: %.2f units, color: %s",
                calculateArea(), width, length, getColor());
    }
}
