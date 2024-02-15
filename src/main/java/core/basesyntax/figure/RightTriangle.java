package core.basesyntax.figure;

import core.basesyntax.figure.Figure;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;

    public RightTriangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return 0.5 * firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle - Area: " + getArea() + ", firstSide: "
                + firstSide + ", secondSide: " + secondSide + ", color: " + color);
    }
}
