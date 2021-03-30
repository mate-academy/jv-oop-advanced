package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import core.basesyntax.FigureSupplier;

public class IsoscelesTrapezoid extends Rectangle implements ColorSupplier, FigureSupplier {

    private double height;

    public IsoscelesTrapezoid(double sideA, double sideB) {
        super(sideA, sideB);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public IsoscelesTrapezoid(double sideA, double sideB, double height) {
        setSideA(sideA);
        setSideB(sideB);
        this.height = height;
    }

    @Override
    public double area() {
        return (getSideA() + getSideB()) / 2 * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + area() + " sq. units, side a length: " + getSideA() + " units, side b length: " + getSideB() + " units, height length: " + getHeight() + " units, color: " + ColorSupplier.getColor();
    }
}
