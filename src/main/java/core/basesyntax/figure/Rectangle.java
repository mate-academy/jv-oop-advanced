package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class Rectangle extends Figure {
    private int length;
    private int width;
    private double area;

    public Rectangle(String name, Color color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
        resultArea();
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void setArea(double area) {
        this.area = area;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void resultArea() {
        setArea(getLength() * getWidth());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + getArea() + " sq.units"
                + ", length: " + getLength() + " units, "
                + "width: " + getWidth() + " units, "
                + "color: " + getColor().name());
    }
}
