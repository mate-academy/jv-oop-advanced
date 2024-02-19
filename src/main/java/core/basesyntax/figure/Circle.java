package core.basesyntax.figure;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(FigureType.CIRCLE, color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, "
                        + "area: %.1f sq. units, "
                        + "radius: %d units, "
                        + "color: %s",
                getType().name().toLowerCase(),
                getArea(),
                radius,
                getColor().name().toLowerCase()
        ));
    }
}
