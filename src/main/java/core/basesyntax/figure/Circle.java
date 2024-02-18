package core.basesyntax.figure;

import core.basesyntax.colors.Color;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color randomColor) {
        super(randomColor, "Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureName()
                + System.lineSeparator()
                + "area: " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + "radius: " + radius + " units"
                + System.lineSeparator()
                + "color: " + getColor());
    }
}
