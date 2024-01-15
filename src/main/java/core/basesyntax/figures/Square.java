package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + Math.rint(getArea())
                + " sq.units, side: " + side + " units, color: " + getColor());
    }
}
