package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle | radius: " + String.format("%.2f", radius)
                + " | area: " + String.format("%.2f", calculateArea())
                + " | color: " + getColor());
    }
}
