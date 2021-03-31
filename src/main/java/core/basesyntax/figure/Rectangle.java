package core.basesyntax.figure;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(double weight, double length, String name, String color) {
        super(color, name);
        this.width = weight;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, weight: " + width
                + " units, length: " + length
                + " units, color: " + getColor());
    }
}
