package core.basesyntax;

public class Square extends AbstractFigure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String draw() {
        return String.format("Figure: square, area: %.2f sq.units, "
                        + "side: %.2f units, color: %s", calculateArea(),
                side, getColor());
    }
}
