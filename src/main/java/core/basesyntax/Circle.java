package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void toDraw() {
        String format = new DecimalFormat("0.0").format(getArea());
        System.out.println("Figure: circle, area: "
                + format + " sq.units, radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
