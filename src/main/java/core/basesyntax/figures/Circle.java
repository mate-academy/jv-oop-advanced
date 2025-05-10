package core.basesyntax.figures;

import core.basesyntax.constants.ColorName;

public class Circle extends Figure {
    private final int radius;

    public Circle(ColorName color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (double) Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + radius + ", area: " + calculateArea());
    }
}

