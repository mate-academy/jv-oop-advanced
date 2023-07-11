package core.basesyntax;

import core.basesyntax.model.Figure;

public class Circle extends Figure {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure is circle: color - " + getColor()
                + ", radius - " + radius + ", area - " + getArea());
    }
}
