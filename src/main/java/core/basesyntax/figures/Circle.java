package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double obtainArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("circle area: "
                + obtainArea()
                + " radius: "
                + radius
                + " color: "
                + color);

    }
}
