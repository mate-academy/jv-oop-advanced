package core.basesyntax;

import core.basesyntax.service.Color;

public class Rectangle extends AbstractFigure {
    private double length;
    private double width;

    public Rectangle(double length, double width, Color color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " units, width: " + width + ", color: " + color);
    }
}
