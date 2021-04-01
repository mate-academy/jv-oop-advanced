package core.basesyntax;

import core.basesyntax.suppliers.Colors;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String name, Colors color, double firstBase,
                              double secondBase, double height) {
        super(name, color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    public double getfirstBase() {
        return firstBase;
    }

    public void setfirstBase(double firstBase) {
        this.firstBase = firstBase;
    }

    public double getsecondBase() {
        return secondBase;
    }

    public void setsecondBase(double secondBase) {
        this.secondBase = secondBase;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) * (height) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "firstBase: " + String.format("%.2f", firstBase)
                + " secondBase: " + String.format("%.2f", secondBase)
                + " height: " + String.format("%.2f", height)
                + " units, " + "color: " + getColor());
    }
}
