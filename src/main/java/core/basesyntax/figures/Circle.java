package core.basesyntax.figures;

import core.basesyntax.Color;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle{"
                + "color=" + color
                + ", radius=" + radius
                + ", area=" + getArea()
                + '}');
    }
}
