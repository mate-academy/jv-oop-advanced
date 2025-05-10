package core.basesyntax.figure;

import core.basesyntax.supplier.Color;

public class Square extends Figure {
    private final double side;

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
        System.out.println("Figure: Square, area: " + getArea() + " sq. units, side: "
                + side + " units, color: " + getColor());

    }
}
