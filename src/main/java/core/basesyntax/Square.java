package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(String color, int size) {
        super(color);
        side = size;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public String toString() {
        return "square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + color.toLowerCase();
    }
}
