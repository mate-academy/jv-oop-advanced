package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: RightTriangle" + ", color= " + color
                + ", area= " + getArea()
                + " unit sq., Length A=" + firstLeg
                + " unit sq., Length B= " + secondLeg + " unit sq.");
    }
}
