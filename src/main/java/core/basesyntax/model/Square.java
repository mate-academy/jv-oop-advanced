package core.basesyntax.model;

import core.basesyntax.Drawable;
import core.basesyntax.FigureArea;

public class Square implements Drawable, FigureArea {
    private String color;
    private double side;

    public Square(String color, double side) {
        this.color = color;
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
