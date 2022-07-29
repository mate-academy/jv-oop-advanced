package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double figureArea;

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void getArea() {
        figureArea = (0.5 * firstLeg * secondLeg);
    }

    @Override
    public void draw() {
        getArea();
        System.out.println("Right triangle, area: " + figureArea + ", first leg: " + firstLeg
                + ", second leg: " + secondLeg + ", color: " + getColor());
    }
}
