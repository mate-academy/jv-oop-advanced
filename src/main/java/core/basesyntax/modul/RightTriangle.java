package core.basesyntax.modul;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * this.firstLeg * this.secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle"
                + ", area: " + getArea()
                + ", firstLeg: " + this.firstLeg
                + ", secondLeg: " + this.secondLeg
                + ", color: " + getColor());
    }
}
