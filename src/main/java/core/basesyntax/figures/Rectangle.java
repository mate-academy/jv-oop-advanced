package core.basesyntax.figures;

import core.basesyntax.behavior.Shape;

public class Rectangle implements Shape {
    private String name;
    private String color;
    private double width;
    private double height;

    public Rectangle(double width, double height, String name, String color) {
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", getArea: "
                + getArea() + " sq. units, width: " + width + " sq. units, height: "
                + height + " units: color" + color);
    }

}

