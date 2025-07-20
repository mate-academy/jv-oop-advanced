package core.basesyntax.shapes;

import core.basesyntax.color.Color;
import core.basesyntax.figure.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.2f sq. units, "
                        + "radius: %.2f units, "
                        + "color: %s\n",
                this.getClass().getSimpleName().toLowerCase(),
                getArea(),
                radius,
                getColor().name());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
