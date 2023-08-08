package core.basesyntax.figures;

import java.util.Locale;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf(Locale.US,
                "Figure: %s, area: %.2f sq.units, radius: %d units, color: %s%n",
                "circle", getArea(), radius, color
        );
    }
}
