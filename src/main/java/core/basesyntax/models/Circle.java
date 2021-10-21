package core.basesyntax.models;

import core.basesyntax.enums.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: Circle, Area: %s, Radius: %d, Color: %s",
                getSquare(), getRadius(), getColor()));
    }
}
