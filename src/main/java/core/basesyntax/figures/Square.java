package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor();
    }
}
