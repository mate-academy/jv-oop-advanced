package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure {
    private final int radius;

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
        String drawCircle = String.format("Figure: circle, area: %.1f sq.units, radius: %d units, "
                            + "color: %s.", getArea(), radius,
                            getColor().toLowerCase(Locale.ROOT));
        System.out.println(drawCircle);
    }
}
