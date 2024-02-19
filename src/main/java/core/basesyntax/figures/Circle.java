package core.basesyntax.figures;

import core.basesyntax.Color;

public class Circle extends Figure {
    private final double radius;
    private Color color;

    public Circle(Color color,double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq. units, radius: "
                + radius + " unit, color: " + color);
    }
}
