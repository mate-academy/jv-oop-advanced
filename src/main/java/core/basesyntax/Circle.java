package core.basesyntax;

import java.text.DecimalFormat;

public class Circle implements Figure {
    private final int radius;
    private final String color;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: circle,"
                + " area: " + new DecimalFormat("#0.0").format(getArea()) + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor().toLowerCase();
    }
}
