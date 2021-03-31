package core.basesyntax.figure;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double weight;
    private double length;

    public Rectangle(double weight, double length, String name, String color) {
        super(color, name);
        this.weight = weight;
        this.length = length;
    }

    @Override
    public double getArea() {
        return weight * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, weight: " + weight
                + " units, length: " + length
                + " units, color: " + getColor());
    }
}
