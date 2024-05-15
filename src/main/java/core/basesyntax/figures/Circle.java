package core.basesyntax.figures;

import core.basesyntax.util.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + ", radius: "
                + getRadius() + ", color: " + getColor());
    }
}
