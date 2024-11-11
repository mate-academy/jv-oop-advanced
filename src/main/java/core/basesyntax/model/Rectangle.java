package basesyntax.model;

import core.basesyntax.service.AreaCalculator;

public class Rectangle extends Figure implements AreaCalculator {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return getLength() * getWidth();
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq. units, "
                + "length " + getLength() + " units, "
                + "width " + getWidth() + " units, "
                + "color: " + getColor().toLowerCase());
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
