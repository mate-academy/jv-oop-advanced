package core.basesyntax.shape;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return "Shape: circle; area: " + getArea() + "; radius: " + radius
                + "; color: " + getColor();
    }
}
