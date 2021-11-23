package core.basesyntax;

import java.util.Locale;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
        this.figureType = FigureType.CIRCLE.toString().toLowerCase(Locale.ROOT);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, radius: %d units, color: %s%n",
                figureType,
                getArea(),
                radius,
                color);
    }
}
