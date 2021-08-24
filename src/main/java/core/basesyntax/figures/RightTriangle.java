package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    double firstLeg;
    double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double obtainArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("rectangle area: " + obtainArea() + " firstLeg: " + firstLeg + " secondLeg " + secondLeg + " color: " + color);
    }
}
