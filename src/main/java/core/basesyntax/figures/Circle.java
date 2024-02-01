package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Circle, area: " + Math.round(calculateArea() * 10.0) / 10.0
                + " sq. units, radius: " + (int)radius + " units, color: " + color.toLowerCase());
    }
}

