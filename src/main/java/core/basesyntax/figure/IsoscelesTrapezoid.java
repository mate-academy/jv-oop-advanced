package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.IShape;

public class IsoscelesTrapezoid extends Figure implements IShape {
    private double height;
    private double sideA;
    private double sideB;

    public IsoscelesTrapezoid(double sideA, double sideB, double height, String name) {
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        setName(name);
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName()
                + ", area: " + this.getArea()
                + " sq. units, side a: " + this.sideA
                + " units, side b: " + this.sideB
                + " units, height: " + this.height
                + " units, color: " + this.getColor());
    }

    public double getHeight() {
        return height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
