package core.basesyntax.model;

import java.text.DecimalFormat;

public class Circle extends Figure implements AreaCalculator {
    private int radius;
    private DecimalFormat decimalFormat = new DecimalFormat("0.0");

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Double.parseDouble(decimalFormat.format(Math.PI * radius * radius));
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Figure: circle, area: ").append(getArea())
                .append(" sq.units, radius: ").append(radius)
                .append(" units, color: ").append(getColor()).toString();
    }
}
