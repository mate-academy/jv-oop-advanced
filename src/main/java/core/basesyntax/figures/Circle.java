package core.basesyntax.figures;

import core.basesyntax.Color;

public class Circle extends Figure {
    private final String name = "circle";
    private double radius;

    public Circle(Color color, double radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor().name().toLowerCase());
    }
}
