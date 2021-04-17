package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color, String identification) {
        super(color, identification);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", getArea: "
                + getArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
