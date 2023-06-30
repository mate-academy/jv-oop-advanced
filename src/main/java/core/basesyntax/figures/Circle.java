package core.basesyntax.figures;

import core.basesyntax.colorSupplier.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(2, radius) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Circle: radius - " + radius
                           + ", color - " + getColor().name()
                           + ", area - " + getArea()
                           + '.');
    }
}
