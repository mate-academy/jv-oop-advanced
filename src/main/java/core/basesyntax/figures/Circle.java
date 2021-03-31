package core.basesyntax.figures;

import core.basesyntax.behavior.Shape;

public class Circle implements Shape {
    private String name;
    private String color;
    private double radius;

    public Circle(double radius, String name, String color) {
        this.name = name;
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", getArea: "
                + getArea() + " sq. units, radius: "
                + radius + " units: color" + color);
    }
}
