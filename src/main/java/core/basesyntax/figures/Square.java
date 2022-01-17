package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        return "Figure: square, "
                + " area: " + getArea() + " sq.units,"
                + " side: " + side + "units,"
                + " color: " + super.getColor();
    }
}
