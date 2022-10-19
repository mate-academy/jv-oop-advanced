package core.basesyntax;

public class Square extends Side1Figure {
    public Square(String color, int a) {
        super(color, a);
    }

    @Override
    public double getSquare() {
        return Math.pow(sideA, 2);
    }

    @Override
    public String toString() {
        return "square, area: " + getSquare()
                + " sq.units, side: " + sideA
                + " units, color: " + color.toLowerCase();
    }
}
