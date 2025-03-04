package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Square extends Figure {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = round(side);
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + color);
    }

    private double round(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}
