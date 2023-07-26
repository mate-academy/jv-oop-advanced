package core.basesyntax.figure;

import core.basesyntax.service.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void drawFigure() {
        double square = Math.pow(side, 2);

        System.out.println("Figure: square, area: " + square
                + " sq.units, side: " + side
                + " units,"
                + " color: " + getColor());
    }
}
