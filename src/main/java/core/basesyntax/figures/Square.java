package core.basesyntax.figures;

import core.basesyntax.Color;

public class Square extends Figure {
    private final float side;

    public Square(Color color, float side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + getColor().name());
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
