package core.basesyntax;

public class Square extends Figure {
    private static final FigureShape shape = FigureShape.SQUARE;
    private final double side;

    public Square(double side, String color) {
        super(color, shape.name());
        this.side = side;
    }

    @Override
    public String drawFigure() {
        return String.format("Figure: %s, area: %f sq.units, "
                        + "side: %f units, color: %s",
                shape.name().toLowerCase(), getArea(), side, getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
