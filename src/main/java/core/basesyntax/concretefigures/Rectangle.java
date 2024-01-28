package core.basesyntax.concretefigures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double height;
    private double length;

    public Rectangle(String color, double height, double length) {
        super(color);
        this.height = height;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return height * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + calculateArea()
                + " units, height: " + getHeight()
                + " units, length: " + getLength()
                + " units, color: " + getColor());
    }
}
