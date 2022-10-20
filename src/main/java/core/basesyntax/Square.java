package core.basesyntax;

public class Square extends Figure {
    private final int side;
    public Square(String color, int a) {
        super(color);
        side = a;
    }

    @Override
    public double getSquare() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "square, area: " + getSquare()
                + " sq.units, side: " + side
                + " units, color: " + color.toLowerCase();
    }
}
