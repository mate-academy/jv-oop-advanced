package core.basesyntax.model.impls;

import core.basesyntax.model.Shape;

public class IsoscelesTrapezoid extends Shape {
    private double upperBse;
    private double lowerBse;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBse, double lowerBse, double height) {
        super(color);
        this.upperBse = upperBse;
        this.lowerBse = lowerBse;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return (upperBse + lowerBse) / 2 * height;
    }

    public double getUpperBse() {
        return upperBse;
    }

    public void setUpperBse(double upperBse) {
        this.upperBse = upperBse;
    }

    public double getLowerBse() {
        return lowerBse;
    }

    public void setLowerBse(double lowerBse) {
        this.lowerBse = lowerBse;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
