package core.basesyntax.figure;

import core.basesyntax.Figure;
import core.basesyntax.enums.FigureName;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setFigureName(FigureName.RIGHTTRIANGLE);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getFigureName() + ", "
                + "area: " + getArea() + " sq. units, "
                + "firstLeg: " + firstLeg + ", secondLeg: " + secondLeg
                + ", color: " + this.getColor());
    }
}
