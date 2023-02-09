package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public int calculateArea() {
        return (int) Math.PI * radius * radius;
    }
}
