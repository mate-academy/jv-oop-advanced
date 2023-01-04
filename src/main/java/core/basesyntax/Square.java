package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("Figure: square, area:  %.1f sq.units, side: %.1f units, color: %s",
                            getArea(), side, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
