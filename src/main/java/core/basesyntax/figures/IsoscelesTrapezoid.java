package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private static final double ROUNDING_FACTOR = 10.0;
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(double lowerBase, double upperBase, double height, String color) {
        super(color);
        this.base1 = round(lowerBase);
        this.base2 = round(upperBase);
        this.height = round(height);
    }

    @Override
    public double getArea() {
        return ((base1 + base2) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, base1: " + base1
                + " units, base2: " + base2
                + " units, height: " + height
                + " units, color: " + getColor());
    }

    private double round(double value) {
        return Math.round(value * ROUNDING_FACTOR) / ROUNDING_FACTOR;
    }
}
