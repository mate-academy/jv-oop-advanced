package core.basesyntax.figure;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.DrawFigure;
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
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + firstLeg
                + "secondLeg: " + secondLeg
                + "color: " + getColor());
    }
}
