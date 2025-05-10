package core.basesyntax.figure;

import core.basesyntax.model.Color;
import core.basesyntax.model.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Radius: " + radius);
        super.draw();
    }

    @Override
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
}
