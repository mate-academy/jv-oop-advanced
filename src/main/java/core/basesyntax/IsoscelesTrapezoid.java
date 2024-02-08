package core.basesyntax;

import core.basesyntax.service.Color;

public class IsoscelesTrapezoid extends AbstractFigure {
    private double upperBase;
    private double lowerBase;
    private double legs;

    public IsoscelesTrapezoid(double upperBase, double lowerBase, double legs, Color color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.legs = legs;
    }

    @Override
    public double getArea() {
        return 0.5 * (upperBase + lowerBase) * legs;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, upperBase: " + upperBase + " units, lowerBase: "
                + lowerBase + ", legs: " + legs + ", color: " + color);
    }
}
