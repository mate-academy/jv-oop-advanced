package core.basesyntax.domain;

import core.basesyntax.domain.parent.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf(getClass().getSimpleName().toLowerCase() + ", area: %s sq. units, "
                        + "radius: %s units, color: %s%n", calculateArea(), radius, color);
    }
}
