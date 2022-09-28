package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
