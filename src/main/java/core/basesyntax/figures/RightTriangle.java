package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;

public class RightTriangle extends Figure implements AreaCalculator {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String colour, double firstLeg, double secondLeg) {
        super(colour);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Figure: " + Figures.RIGHT_TRIANGLE.name().toLowerCase() + ", area:" + getArea()
                + " sq.units, first leg: " + firstLeg + " , second leg: " + secondLeg +" units, color: " + getColour();
    }
}
