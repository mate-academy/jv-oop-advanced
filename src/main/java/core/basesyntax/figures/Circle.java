package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double obtainArea() {

        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("circle area: " + obtainArea() + " radius: " + radius + " color: " + color);

    }
}
