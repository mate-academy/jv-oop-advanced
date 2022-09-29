package core.basesyntax.figures;

import core.basesyntax.suppliers.Color;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(Color color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getFormatted(getArea())
                + " sq.units, width: "
                + getFormatted(getWidth())
                + " units, length: "
                + getFormatted(getLength())
                + " color: "
                + getColor().name().toLowerCase());
    }
}
