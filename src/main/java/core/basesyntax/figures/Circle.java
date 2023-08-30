package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
            + " area: " + getArea()
            + " sq.units, radius: " + radius
            + " units, color: " + getColor().toLowerCase());
    }
}
