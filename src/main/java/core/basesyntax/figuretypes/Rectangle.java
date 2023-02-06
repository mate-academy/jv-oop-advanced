package core.basesyntax.figuretypes;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return Math.round(area * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " units, "
                + "length: " + length + " units, "
                + "width: " + width + " units, "
                + "color: " + color);
    }
}
