package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format(Locale.US, "Figure: circle, "
                         + "area: %.1f sq.units, radius: %d units, color: %s",
                 area(), this.radius, this.getColor()));
    }
}
