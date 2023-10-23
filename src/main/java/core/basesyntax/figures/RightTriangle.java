package core.basesyntax.figures;

import core.basesyntax.Color;

public class RightTriangle extends Figure {
    private double firstSide;
    private double secondSide;

    public RightTriangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() + " sq.unit, side: "
                + firstSide + " units, secondLeg: " + secondSide
                + " units, color: " + getColor().name());
    }
}
