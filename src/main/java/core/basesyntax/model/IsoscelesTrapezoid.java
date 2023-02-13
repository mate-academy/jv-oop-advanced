package core.basesyntax.model;

import core.basesyntax.Color;

public class IsoscelesTrapezoid extends Figure {
    private double baseSide1;
    private double baseSide2;
    private double height;

    public IsoscelesTrapezoid(Color color, double longerBase, double shorterBase, double height) {
        super(color);
        this.baseSide1 = longerBase;
        this.baseSide2 = shorterBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = (baseSide1 + baseSide2) / 2 * height;
        return Math.round(area * DECIMAL_FORMAT) / DECIMAL_FORMAT;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, "
                + "area: " + calculateArea() + " units, "
                + "baseSide1: " + baseSide1 + " units, "
                + "baseSide2: " + baseSide2 + " units, "
                + "color: " + getColor());
    }
}
