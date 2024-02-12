package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle has " + color + " and radius " + radius
                + ". Area is " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
