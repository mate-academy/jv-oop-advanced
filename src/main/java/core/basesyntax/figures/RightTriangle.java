package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Right triangle, area: " + getArea() + ", first leg: " + firstLeg
                + ", second leg: " + secondLeg + ", color: " + getColor());
    }
}
