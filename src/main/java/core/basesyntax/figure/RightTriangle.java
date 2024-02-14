package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private final Color color;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    public void draw() {
        System.out.println(
                "Figure: triangle, area: " + getArea()
                + " sq. units, firstLeg: " + this.firstLeg
                + " units, secondLeg: " + this.secondLeg
                + " units, color: " + this.color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
