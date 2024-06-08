package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private double radius;
    private DecimalFormat df = new DecimalFormat("#.00");

    public Circle(String color, double area) {
        super(color);
        this.radius = area;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + df.format(getArea()) + " sq. units, radius: "
                + df.format(radius) + "  units, color: " + getColor();
    }
}
