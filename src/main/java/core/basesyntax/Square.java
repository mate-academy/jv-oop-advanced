package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public String drawFigure() {
        return String.format("Figure: %s, area: %.2f sq.units, "
                        + "side: %.2f units, color: %s",
                Square.class.getSimpleName().toLowerCase(),
                getArea(), side, getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
