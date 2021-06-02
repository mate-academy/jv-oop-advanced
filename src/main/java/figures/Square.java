package figures;

import randomiser.Color;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(Color color, double firstSide) {
        super(color, firstSide, firstSide);
    }

    @Override
    public double getSquare() {
        return Math.pow(super.getFirstSide(), 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * super.getFirstSide();
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: square, area: %.2f sq.units, side %.2f units, color: %s",
                getSquare(), getFirstSide(), getColor());
    }
}
