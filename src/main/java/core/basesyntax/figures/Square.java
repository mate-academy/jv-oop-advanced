package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.unit, side: "
                + side + " units, color: " + getColor().name());
    }
}
