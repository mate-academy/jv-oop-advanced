package core.basesyntax;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Circle extends Figure {
    private static final DecimalFormat decimalFormat = new DecimalFormat("#.##");
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Shape: circle, area: " + decimalFormat.format(calculateArea())
                + "sq. units, radius: " + radius
                + " sq. units, color: " + getColor());
    }
}
