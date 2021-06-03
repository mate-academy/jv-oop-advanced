package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return String.format("Figure: Square, area: %.2f sq.units, side: %.3f units, color: %s",
                getArea(), side, getColor());
    }
}
