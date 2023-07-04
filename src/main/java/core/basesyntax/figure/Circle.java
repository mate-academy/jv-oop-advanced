package core.basesyntax.figure;

import core.basesyntax.Color;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle{area: " + getArea() + " square units, " + " radius = "
                + radius + ", color = " + getColor() + '}');
    }
}

