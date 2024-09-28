package core.basesyntax.model;

import core.basesyntax.Figure;

public class Circle implements Figure {
    private final String color;
    private final double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }


    @Override
    public void draw() {
        System.out.println("Color: " + color
                         + "Type: Circle "
                         + "Radius: " + radius);
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
