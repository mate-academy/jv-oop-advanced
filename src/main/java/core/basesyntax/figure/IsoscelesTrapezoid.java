package core.basesyntax.figure;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double upperBase;
    private double downBase;
    private double height;

    public IsoscelesTrapezoid(String color, double upperBase, double downBase, double height) {
        super(color);
        this.upperBase = upperBase;
        this.downBase = downBase;
        this.height = height;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getDownBase() {
        return downBase;
    }

    public void setDownBase(double downBase) {
        this.downBase = downBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (upperBase + downBase / 2) * height;
    }

    @Override
    public void toDrawFigure() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + getArea() + " sq.units, "
                + "upperBase: " + upperBase + " units, "
                + "downBase: " + downBase + " units, "
                + "height: " + height + "color: "
                + getColor());
    }
}
