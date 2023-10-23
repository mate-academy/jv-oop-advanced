package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, int radius, Color color) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", color: " + getColor()
                + ", area: " + format.format(getArea()) + " sq. units, "
                + "radius: " + getRadius() + " units");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
