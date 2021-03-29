package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        setIdentification("rectangle");
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
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, length: " + getLength() + " units, width: "
                + getWidth() + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public Figure getFigure() {
        return new Rectangle(Math.random() * 50, Math.random() * 50);
    }
}
