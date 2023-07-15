package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public Double areaOfFigure() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: Circle, color: " + getColor() + ", radius " + radius
                + " units, area: " + areaOfFigure() + " sq.units");
    }
}
