package core.basesyntax.entity;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor();
    }
}

