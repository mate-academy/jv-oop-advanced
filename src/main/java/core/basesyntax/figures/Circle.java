package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius * 100.0) / 100.0;
    }

    @Override
    public String drawInfo() {
        return "Circle:"
                + " radius = " + getRadius()
                + "; color = " + getColor()
                + "; area = " + getArea();
    }
}
