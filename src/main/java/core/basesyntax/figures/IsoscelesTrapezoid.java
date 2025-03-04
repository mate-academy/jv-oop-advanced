package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;
    private String color;

    public IsoscelesTrapezoid(double base1, double base2, double height, String color) {
        this.base1 = round(base1);
        this.base2 = round(base2);
        this.height = round(height);
        this.color = color;
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
                + " units, color: " + color);
    }

    private double round(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}
