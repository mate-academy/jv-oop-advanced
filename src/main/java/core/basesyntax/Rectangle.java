package core.basesyntax;

import java.text.DecimalFormat;

public class Rectangle extends Figure {
    private double sideA;
    private double sideB;
    private DecimalFormat df = new DecimalFormat("#.00");

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + df.format(getArea()) + " sq. units, side A: "
                + df.format(sideA) + " units, side B: " + df.format(sideB)
                + " units, color: " + getColor();
    }
}
