package core.basesyntax.model;

import core.basesyntax.supplier.ColorSupplier;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius + " units, color: "
                + getColor());
    }
}
