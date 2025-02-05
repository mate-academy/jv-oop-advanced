package core.basesyntax.shape;

import core.basesyntax.Figure;
import core.basesyntax.Shape;

public class Rectangle extends Shape implements Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width + " height: " + height + " units, color: " + color);
    }
}
