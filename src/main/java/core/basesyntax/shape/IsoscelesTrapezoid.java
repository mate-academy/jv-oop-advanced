package core.basesyntax.shape;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int sideA;
    private int sideB;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((double) (sideA + sideB) / 2) * height;
    }

    @Override
    public String draw() {
        return "Shape: isosceles trapezoid; area: " + getArea() + "; side, sideA: " + sideA
                + ", sideB: " + sideB + ", height: " + height + ", color: " + getColor();
    }
}
