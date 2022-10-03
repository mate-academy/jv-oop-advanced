package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private final int radius;
    private final DecimalFormat format;

    public Circle(String color, int radius) {
        super(color);
        this.format = new DecimalFormat(Figure.FORMAT_FOR_FUNCTIONAL_NUMBERS);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String draw() {
        return "Figure: circle,"
                + " area: " + format.format(getArea()) + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + getColor().toLowerCase();
    }
}
