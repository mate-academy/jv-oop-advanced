package core.basesyntax.figure;

import core.basesyntax.behaviour.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super.setColor(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, "
                + "area: " + this.getArea() + " sq.units, "
                + "radius: " + this.radius + " units, "
                + "color: " + super.getColor());
    }
}
