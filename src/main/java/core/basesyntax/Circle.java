package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + new DecimalFormat(ROUNDING_PATTERN).format(calculateArea())
                + " sq.units, "
                + "radius: " + radius + " units,"
                + " color: " + getColor());
    }
}
