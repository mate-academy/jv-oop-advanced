package core.basesyntax.figuretype;

import core.basesyntax.figure.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: square, area: %.1f sq.units, side: %s"
                          + " units, color: %s%n",
                 getArea(), side, getColor().toLowerCase());
    }
}
