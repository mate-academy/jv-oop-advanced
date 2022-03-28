package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private int oneLeg;
    private int secondLeg;

    public RightTriangle(Color color, int oneLeg, int secondLeg) {
        super(color);
        this.oneLeg = oneLeg;
        this.secondLeg = secondLeg;
    }

    public int getOneLeg() {
        return oneLeg;
    }

    public void setOneLeg(int oneLeg) {
        this.oneLeg = oneLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * oneLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + Math.rint(getArea())
                + " sq.units, one leg: " + oneLeg + " units, second leg: " + secondLeg
                + " units, color: " + getColor());
    }
}
