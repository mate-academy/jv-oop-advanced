package core.basesyntax.fiqures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + getArea() + "sq.units, side: "
                + side + ", color: " + getColor());
    }
}
