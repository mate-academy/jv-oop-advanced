package core.basesyntax.model;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.0");
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Double.parseDouble(DECIMAL_FORMAT.format(Math.PI * radius * radius));
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: circle, area: ").append(getArea())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(getColor().toLowerCase()));
    }
}
