package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class Circle extends Figure {
    private static final double AREA_MULTIPLIER = 2;
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle\nColor : " + getColor().name()
                + "\nArea: " + calculateArea() + "\nRadius: " + radius);
    }

    @Override
    public double calculateArea() {
        return AREA_MULTIPLIER * Math.PI * radius * radius;
    }
}
