package core.basesyntax.figures;

import core.basesyntax.Figure;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public Double areaOfFigure() {
        return (firstLeg + secondLeg) / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Right Triangle, color: " + getColor()
                + ", first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, area: " + areaOfFigure() + " sq.units");
    }
}
