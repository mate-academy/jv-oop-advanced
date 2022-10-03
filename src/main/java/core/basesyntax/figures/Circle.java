package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius,String color) {
        super(color);
        this.radius = radius;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Circle, area:"
                        + this.calculateArea()
                        + " sq.units, radius: " + this.radius
                        + " units, color: " + this.getColor());
    }
}
