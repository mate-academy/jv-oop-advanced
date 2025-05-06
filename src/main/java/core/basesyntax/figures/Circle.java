package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle" + ", area: " + area() + " sq. units"
                + ", radius: " + radius + " units, " + "color: " + color);
    }

    @Override
    public double area() {
        return 3.14 * (radius * radius);
    }
}
