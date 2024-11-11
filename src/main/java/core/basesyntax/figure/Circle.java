package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private final int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        this.color = color;
    }
    @Override
    public double countArea() {
        return PI*radius*radius;
    }

    @Override
    public String showInformation() {
        return String.format("Figure: circle, area: %f sq. units, radius: %d units, color: %s", countArea(), radius, color.name().toLowerCase());
    }
}
