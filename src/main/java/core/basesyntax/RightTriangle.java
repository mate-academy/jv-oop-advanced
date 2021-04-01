package core.basesyntax;

import core.basesyntax.suppliers.Colors;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String name, Colors color, double firstLeg, double secondLeg) {
        super(name, color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getfirstLeg() {
        return firstLeg;
    }

    public void setfirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getsecondLeg() {
        return secondLeg;
    }

    public void setsecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getName() + ", " + "area: "
                + String.format("%.2f", getArea()) + " sq. units, "
                + "base length: " + String.format("%.2f", firstLeg)
                + " secondLeg: " + String.format("%.2f", secondLeg)
                + " units, " + "color: " + getColor());
    }
}
