package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: SQUARE, area: "
                + getArea()
                + " sq.units, "
                + "side A: "
                + side
                + " units,"
                + " color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
