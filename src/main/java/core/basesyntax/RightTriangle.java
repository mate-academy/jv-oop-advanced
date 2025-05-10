package core.basesyntax;

import java.util.Locale;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, FigureType figureType, int firstLeg, int secondLeg) {
        super(color,figureType);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: "
                + String.valueOf(getFigureType()).toLowerCase(Locale.ROOT) + ","
                + " area: "
                + Math.round(getArea() * 100.0) / 100.0 + " sq.units, "
                + " firstLeg: " + firstLeg + " units, "
                + " secondLeg: " + secondLeg + " units, "
                + " color: " + getColor());
    }
}
