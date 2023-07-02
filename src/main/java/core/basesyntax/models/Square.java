package core.basesyntax.models;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double size) {
        super(color);
        this.side = size;
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
