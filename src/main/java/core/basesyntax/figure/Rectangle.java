package core.basesyntax.figure;

import core.basesyntax.template.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, length: " + length + " units, width: " + width + " units, color: " + getColor());
    }
}
