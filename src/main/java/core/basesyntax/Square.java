package core.basesyntax;

public class Square extends Figure {
    private final double side;

    Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea()
                + " sq.units, side: " + getSide()
                + " units, color: " + getColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
