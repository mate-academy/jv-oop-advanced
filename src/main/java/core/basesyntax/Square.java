package core.basesyntax;

public class Square extends Figure {
    private static final FigureShape shape = FigureShape.SQUARE;
    private final String color;
    private final double side;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Figure: %s, area: %f sq.units, "
                        + "side: %f units, color: %s",
                shape.name().toLowerCase(), getArea(), side, color);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
