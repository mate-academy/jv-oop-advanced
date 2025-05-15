package core.basesyntax.model.impls;

import core.basesyntax.model.Shape;

public class IsoscelesTrapezoid extends Shape {
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double lowerBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    public double getUpperBse() {
        return upperBase;
    }

    public void setUpperBse(double upperBse) {
        this.upperBase = upperBse;
    }

    public double getLowerBse() {
        return lowerBase;
    }

    public void setLowerBse(double lowerBse) {
        this.lowerBase = lowerBse;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
