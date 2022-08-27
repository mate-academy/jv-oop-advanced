package core.basesyntax.figures;

import core.basesyntax.FigureTypes;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double area;

    public RightTriangle(double firstLeg, double secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        this.area = (this.firstLeg * this.secondLeg) / 2;
        return this.area;
    }

    @Override
    public void draw() {
        System.out.println("Figure:" + FigureTypes.RIGHT_TRIANGLE + ", "
                + "area: " + this.area + " sq.units, "
                + "first leg: " + this.firstLeg + " units, "
                + "second leg: " + this.secondLeg + " units, "
                + "color:" + this.color);
    }
}
