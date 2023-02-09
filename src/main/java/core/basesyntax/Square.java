package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(String color, double side) {
        super(Figure.SQUARE.name(), color);
        this.side = side;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, Side: %.0f units, color: %s",
                getType(), getArea(), side, getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
