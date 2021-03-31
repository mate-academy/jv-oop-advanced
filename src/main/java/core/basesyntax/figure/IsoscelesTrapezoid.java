package core.basesyntax.figure;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double sideA;
    private double sideB;

    public IsoscelesTrapezoid(double sideA, double sideB, double height,
                              String name, String color) {
        super(color, name);
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * (height / 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, side a: " + sideA
                + " units, side b: " + sideB
                + " units, height: " + height
                + " units, color: " + getColor());
    }

    public double getHeight() {
        return height;
    }
}
