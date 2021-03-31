package core.basesyntax.figures;

import core.basesyntax.behavior.Shape;

public class RightTriangle implements Shape {
    private String name;
    private String color;
    private double legA;
    private double legB;

    public RightTriangle(double legA, double legB, String name, String color) {
        this.name = name;
        this.color = color;
        this.legA = legA;
        this.legB = legB;
    }

    public double getHypotenuse() {
        return Math.sqrt((legA * legA) + (legB * legB));
    }

    @Override
    public double getArea() {
        return (legA * legB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", getArea: "
                + getArea() + " sq. units, hypotenuse: "
                + getHypotenuse() + " units: color" + color);
    }
}
