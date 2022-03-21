package core.basesyntax.modul;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * this.firstLeg * this.secondLeg;
    }

    @Override
    public void toDraw(double area) {
        System.out.println("Figure: right triangle"
                + ", area: " + area
                + ", firstLeg: " + this.firstLeg
                + ", secondLeg: " + this.secondLeg
                + ", color: " + getColor());
    }
}
