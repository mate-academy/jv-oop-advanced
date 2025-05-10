package core.basesyntax.shape;

import core.basesyntax.Figure;
import core.basesyntax.Shape;

public class Square extends Shape implements Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + color);
    }
}
