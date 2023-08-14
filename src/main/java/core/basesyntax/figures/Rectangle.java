package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int width;
    private final int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle has width " + width
                + " and height " + height + "and area " + getArea()
                + " units" + "color: " + getColor().toLowerCase());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
