package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double square() {
        return side * side;
    }

    @Override
    public void draw() {
        String square = String.format("%.1f", square());
        System.out.println("Figure: square, area: " + square + " sq.units, side: " + side + ", units, color: " + super.getColor());
    }
}
