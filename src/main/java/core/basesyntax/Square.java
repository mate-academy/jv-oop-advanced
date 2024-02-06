package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return (double) this.side * this.side;
    }

    @Override
    public String draw() {
        return String.format("Figure: %s, area: %.2f sq.units, side: %d units,"
                + "color: %s", getName(), getArea(), side, getColor());
    }
}
