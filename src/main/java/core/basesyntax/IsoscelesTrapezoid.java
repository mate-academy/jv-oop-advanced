package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends FigureObject {
    private double shortSide;
    private double longSide;
    private double height;

    public IsoscelesTrapezoid(Color color, double shortSide, double longSide, double height) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((longSide + shortSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, area: "
                + new DecimalFormat("#0.00").format(getArea())
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
