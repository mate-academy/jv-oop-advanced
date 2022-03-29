package core.basesyntax.figure;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String name, String color) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
