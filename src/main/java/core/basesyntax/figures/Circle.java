package core.basesyntax.figures;

import core.basesyntax.colors.Color;

public class Circle extends Figure {
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
        return Math.PI * radius * radius;
    }
}
