package core.basesyntax;

import java.text.DecimalFormat;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        return "Figure: circle, area: "
                + decimalFormat.format(calculateArea()) + " sq.units, radius: "
                + radius + " units, color: "
                + getColor();
    }
}
