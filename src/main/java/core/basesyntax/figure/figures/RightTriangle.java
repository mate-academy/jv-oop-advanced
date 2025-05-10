package core.basesyntax.figure.figures;

import core.basesyntax.figure.Figure;

public class RightTriangle extends Figure {
    private final int side;

    public RightTriangle(String name, String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side * Math.sqrt(3) / 4;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, Color: " + getColor()
                + ", Side: " + side
                + ", Area: " + getArea() + ".");
    }
}
