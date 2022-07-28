package core.basesyntax;

import java.text.DecimalFormat;
//IsoscelesTrapezoid has index 5

public class IsoscelesTrapezoid extends Figure {
    private double shortSide;
    private double longSide;
    private double height;

    public IsoscelesTrapezoid(String color, double shortSide, double longSide, double height) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }

    @Override
    public double getFigureArea() {
        return ((longSide + shortSide) / 2) * height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + new DecimalFormat("#0.00").format(getFigureArea())
                + " sq.units, shortSide: "
                + shortSide
                + " units, longSide: "
                + longSide
                + " units, height: "
                + height
                + " units, color: "
                + getColor());
    }
}
