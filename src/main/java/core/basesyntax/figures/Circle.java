package core.basesyntax.figures;

import core.basesyntax.dataprocessor.ColorSupplier;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public void draw() {
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println("Figure: circle, area: " + area() + " sq.unit, radius: "
                + getRadius() + " units, color: " + colorSupplier.getRandomColor());
    }
}
