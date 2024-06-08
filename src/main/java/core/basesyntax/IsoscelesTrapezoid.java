package core.basesyntax;

import java.text.DecimalFormat;

public class IsoscelesTrapezoid extends Figure {
    private double sideA;
    private double sideB;
    private double height;
    private DecimalFormat df = new DecimalFormat("#.00");

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + df.format(getArea())
                + " sq. units, side A: " + df.format(sideA) + " units, side B: "
                + df.format(sideB) + ", height: " + df.format(height) + " color: " + getColor();
    }
}
