package core.basesyntax.Figures;

import core.basesyntax.AbstractClasses.Figure;

public class Circle extends Figure {
    private final int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(int radius) {
        this.radius = radius;
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
