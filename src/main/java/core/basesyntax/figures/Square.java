package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, String type, int side) {
        super(color, type);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, side: %s"
                          + " units, color: %s%n",
                getType().toLowerCase(), getArea(), side, getColor().toLowerCase());
    }
}
