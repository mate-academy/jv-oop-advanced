package core.basesyntax.figuretypes;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return Math.round(area * 100) / 100;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + getArea() + " units, "
                + "radius: " + radius + " units, "
                + "color: " + color);
    }
}
