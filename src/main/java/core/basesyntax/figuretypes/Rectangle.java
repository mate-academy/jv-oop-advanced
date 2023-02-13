package core.basesyntax.figuretypes;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        double area = length * width;
        return Math.round(area * DECIMAL_FORMAT) / DECIMAL_FORMAT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, "
                + "area: " + calculateArea() + " units, "
                + "length: " + length + " units, "
                + "width: " + width + " units, "
                + "color: " + color);
    }
}
