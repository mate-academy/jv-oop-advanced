package core.basesyntax.figures;

import core.basesyntax.model.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double upperBase;
    private double lowerBase;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public void setUpperBase(double upperBase) {
        this.upperBase = upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    public void setLowerBase(double lowerBase) {
        this.lowerBase = lowerBase;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * (upperBase + lowerBase);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.1f sq.units, "
                + "height: %.1f units, upper base: %.1f units, lower base: %.1f units, color: %s%n",
                calculateArea(), this.getHeight(), this.getUpperBase(),
                this.getLowerBase(), this.getColor());
    }
}
