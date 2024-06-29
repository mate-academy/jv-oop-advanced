package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle(int radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
                + "area: "
                + this.getArea()
                + " sq. units, "
                + "radius: "
                + radius
                + " units, "
                + "color: "
                + getColor());
    }
}
