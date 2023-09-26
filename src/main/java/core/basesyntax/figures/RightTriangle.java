package core.basesyntax.figures;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        super.setColor(color);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getArea()
                + " sq.units, first leg: " + getFirstLeg()
                + " units, second leg: " + getSecondLeg()
                + " units, color: " + getColor());
    }
}
