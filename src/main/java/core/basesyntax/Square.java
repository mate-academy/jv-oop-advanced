package core.basesyntax;

import java.text.DecimalFormat;
//Square has index 1

public class Square extends Figure {
    private double sideA;

    public Square(String color, double sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public double getFigureArea() {
        return sideA * sideA;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, area: "
                + new DecimalFormat("#0.00").format(getFigureArea())
                + " sq.units, side: "
                + sideA
                + " units, color:"
                + getColor());
    }

}
