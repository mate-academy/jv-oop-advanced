package core.basesyntax.figures;

import core.basesyntax.Area;
import core.basesyntax.Figure;

public class Rectangle extends Figure implements Area {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double obtainArea() {
        return length * width;

    }

    @Override
    public void draw() {
        System.out.println("rectangle area: "
                + obtainArea()
                + " length: "
                + length
                + " width "
                + width
                + " color: "
                + color);
    }
}
