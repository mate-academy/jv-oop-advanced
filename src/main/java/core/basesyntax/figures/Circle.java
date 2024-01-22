package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor().toLowerCase());

    }
}
