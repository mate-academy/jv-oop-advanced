package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * (radius * radius);
    }

    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq.units, radius: " + radius + " units, color: "
                + getColor());
    }
}
