package core.basesyntax.figures.impl;

import core.basesyntax.figures.Figure;

public class Square extends Figure {
    public static final String NAME = "square";
    private double side;

    public Square() {
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + NAME + ", area: " + getArea() + " sq.units, side: "
                + side + " units, color:" + color);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
