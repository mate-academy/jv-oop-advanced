package core.basesyntax.figure;

import java.util.Locale;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + countArea()
                + " sq.units" + ", radius: " + getRadius() + ", color: "
                + getColor().toLowerCase(Locale.ROOT));
    }
}
