package core.basesyntax.geometry.figures;

import core.basesyntax.geometry.Figure;

public class Circle extends Figure {
    private static final double NUMBER_P = Math.PI;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * NUMBER_P;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + Circle.class.getSimpleName() + ", area: " + calculateArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor() + "\n");
    }
}
