package core.basesyntax;

import core.basesyntax.suppliers.Colors;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String name, Colors color, double width, double length) {
        super(name, color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "width: " + String.format("%.2f", width)
                + " length: " + String.format("%.2f", length)
                + " units, " + "color: " + getColor());
    }
}
