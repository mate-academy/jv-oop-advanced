package core.basesyntax.figures;

import core.basesyntax.temp.Figure;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius * 0.5, 2);
    }

    @Override
    public void draw() {
        System.out.println("Circle, area: " + getArea() + " , radius: " + radius
                + ", color: " + getColor());
    }
}
