package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return super.draw()
            + "\n\tRadius: " + radius
            + "\n--------------------";
    }
}
