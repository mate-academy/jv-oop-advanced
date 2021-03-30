package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color, String identification) {
        super(color, identification);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", getArea: "
                + getArea() + " sq. units, length: " + getLength() + " units, width: "
                + getWidth() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return length * width;
    }

}
