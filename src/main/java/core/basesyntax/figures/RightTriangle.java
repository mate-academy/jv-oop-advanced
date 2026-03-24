package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
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
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: right triangle, area: " + String.format("%.1f",getArea())
                        + " sq. units, firstLeg: " + String.format("%.1f",firstLeg)
                        + " units, secondLeg: " + String.format("%.1f",secondLeg)
                        + " units, color: " + getColor()
        );
    }
}