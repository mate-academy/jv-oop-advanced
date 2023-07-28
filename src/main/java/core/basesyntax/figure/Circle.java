package core.basesyntax.figure;

import core.basesyntax.service.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }
}
