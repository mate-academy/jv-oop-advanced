package core.basesyntax;

public class Square extends Figure {

    private final double side;

    public Square(double side, String color) {
        this.side = side;
        this.color =color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{"
                + "area="
                + getArea()
                + " sq.units"
                + ", side="
                + side
                + " units"
                + ", color='"
                + color
                + '\''
                + '}';
    }
}
