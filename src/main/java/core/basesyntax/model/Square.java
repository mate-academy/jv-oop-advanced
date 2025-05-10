package core.basesyntax.model;

import core.basesyntax.Color;

public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(side, 2);
        return Math.round(area * DECIMAL_FORMAT) / DECIMAL_FORMAT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + calculateArea() + " units, "
                + "side: " + side + " units, "
                + "color: " + getColor());
    }
}
