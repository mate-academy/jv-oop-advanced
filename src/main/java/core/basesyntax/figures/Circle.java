package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void showInfo() {
        System.out.println("Figure: Circle, area: " + Math.PI * radius * radius
                + ", radius: " + radius + " units, color: " + color);
    }
}
