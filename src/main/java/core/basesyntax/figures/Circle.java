package core.basesyntax.figures;

import core.basesyntax.color.Color;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
