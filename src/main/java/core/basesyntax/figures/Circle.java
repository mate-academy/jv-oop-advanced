package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\tRadius: " + radius
                + "\n--------------------");
    }
}
