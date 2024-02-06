package core.basesyntax.figures;

import core.basesyntax.abstracts.Figure;
import core.basesyntax.colosuply.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.round(Math.PI * radius * radius);
    }

    @Override
    public void drawInfo() {
        System.out.println("Circle:"
                + " radius = " + getRadius()
                + "; color = " + getColor()
                + "; area = " + getArea());
    }
}
