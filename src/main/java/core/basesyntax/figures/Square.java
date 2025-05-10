package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private static final double ROUNDING_FACTOR = 10.0;
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = round(side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + getColor());
    }

    private double round(double value) {
        return Math.round(value * ROUNDING_FACTOR) / ROUNDING_FACTOR;
    }
}
