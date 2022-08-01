package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends FigureObject {
    private double length;
    private double height;

    public Rectangle(Color color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getFigureArea() {
        return sideA * sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Rectangle, area: "
                + new DecimalFormat("#0.00").format(getFigureArea())
                + " sq.units, sideA: "
                + sideA
                + " units, sideB: "
                + sideB
                + " units, color: "
                + getColor());
    }
}
