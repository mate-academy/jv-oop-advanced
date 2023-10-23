package core.basesyntax.figures;

import core.basesyntax.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq.unit, side: "
                + side + " units, color: " + getColor().name());
    }
}
