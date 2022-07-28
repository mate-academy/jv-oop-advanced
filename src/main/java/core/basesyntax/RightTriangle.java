package core.basesyntax;

import java.text.DecimalFormat;
//RightTriangle has index 3

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getFigureArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Right Triangle, area: "
                + new DecimalFormat("#0.00").format((getFigureArea()))
                + " sq.units, firstLeg: "
                + firstLeg
                + " units, secondLeg: "
                + secondLeg
                + " units, color: "
                + getColor());
    }
}
