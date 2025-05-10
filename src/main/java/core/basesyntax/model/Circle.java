package core.basesyntax.model;

import core.basesyntax.model.abstraction.Color;
import core.basesyntax.model.abstraction.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle() {
    }

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.ceil(Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "circule" + ", area: "
                + getArea() + " sq.units, radius: "
                + getRadius() + " units, color: "
                + getColor().name().toLowerCase());
    }
}
