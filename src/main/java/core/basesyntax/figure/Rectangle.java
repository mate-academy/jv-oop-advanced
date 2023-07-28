package core.basesyntax.figure;

import core.basesyntax.service.Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, length: " + length
                + " units, width: " + width
                + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
