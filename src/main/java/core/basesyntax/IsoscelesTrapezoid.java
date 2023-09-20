package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private double upperBase;
    private double lowerBase;
    private double height;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double height, String color) {
        super.setColor(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public double getHeight() {
        return height;
    }

    public static IsoscelesTrapezoid createIsoscelesTrapezoid(double upperBase, double lowerBase,
                                                              double height, String color) {
        return new IsoscelesTrapezoid(upperBase, lowerBase, height, color);
    }

    @Override
    public void getArea() {
        double area = ((upperBase + lowerBase) * height / 2);
        System.out.println("Figure: isosceles trapezoid, area: " + decimalFormat.format(area)
                + " sq.units, upperBase: " + decimalFormat.format(upperBase)
                + " units, lowerBase: "
                + decimalFormat.format(lowerBase) + " units, height: "
                + decimalFormat.format(height)
                + " units, color: " + getColor());
    }
}
