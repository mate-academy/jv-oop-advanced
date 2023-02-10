package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.1f sq.units, Side: %.0f units, color: %s",
                this.getClass().getSimpleName(), getArea(), side, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }
}
