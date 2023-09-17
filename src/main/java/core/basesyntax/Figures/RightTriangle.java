package core.basesyntax.Figures;

import core.basesyntax.Shape;

public class RightTriangle extends Shape {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, color=" + getColor()
                + ", firstLeg=" + firstLeg
                + ", secondLeg=" + secondLeg
                + ", area=" + getArea());
    }
}
