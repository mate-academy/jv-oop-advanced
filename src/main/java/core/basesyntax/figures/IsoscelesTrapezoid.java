package core.basesyntax.figures;

import core.basesyntax.behavior.Shape;

public class IsoscelesTrapezoid implements Shape {
    private String name;
    private String color;
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB, double height,
                              String name, String color) {
        this.name = name;
        this.color = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((sideA + sideB) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", getArea: "
                + getArea() + " sq. units, sideA: " + sideA + " sq. units, sideB"
                + sideB + " units: color" + color);
    }
}
