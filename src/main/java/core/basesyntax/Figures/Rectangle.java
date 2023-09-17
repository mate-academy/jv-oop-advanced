package core.basesyntax.Figures;

import core.basesyntax.Shape;

public class Rectangle extends Shape {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, color=" + getColor() + ", length=" + getLength() + ", width=" + getWidth() + ", area=" + getArea());
    }
}
