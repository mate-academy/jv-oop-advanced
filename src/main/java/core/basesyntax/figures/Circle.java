package core.basesyntax.figures;

import core.basesyntax.ColorEnum;

public class Circle extends Figure {
    private final int radius;

    public Circle(ColorEnum color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: " + "circle, "
                + "area: " + String.format("%,.1f", calculateArea()) + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + color.name().toLowerCase()
        );
    }
}
