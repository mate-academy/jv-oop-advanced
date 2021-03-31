package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.IShape;

public class Rectangle extends Figure implements IShape {
    private double weight;
    private double length;

    public Rectangle(double weight, double length, String name) {
        this.weight = weight;
        this.length = length;
        setName(name);
    }

    @Override
    public double getArea() {
        return weight * length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea()
                + " sq. units, weight: " + this.weight
                + " units, length: " + this.length
                + " units, color: " + this.getColor());
    }

    public double getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }
}
