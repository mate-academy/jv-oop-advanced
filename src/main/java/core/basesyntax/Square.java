package core.basesyntax;

import auxiliary.Figure;

public class Square extends Figure {
    private final int side;

    public Square(int side) {
        super.setRandomColor();
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.round((Math.pow(side, 2)) * 100.0) / 100.0;
    }

    public String toString() {
        return "Figure: Square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + side + " units, "
                + "color: " + getColor();
    }
}
