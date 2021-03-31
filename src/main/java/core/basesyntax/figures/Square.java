package core.basesyntax.figures;

import core.basesyntax.behavior.Shape;

public class Square implements Shape {
    private String name;
    private String color;
    private double side;

    public Square(double side, String name, String color) {
        this.name = name;
        this.color = color;
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + ", getArea: "
                + getArea() + " sq. units, side: "
                + side + " units: color" + color);
    }
}

