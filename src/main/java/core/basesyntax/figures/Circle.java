package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + getArea() + " sq. units, radius length: "
                + getRadius() + " units, color: " + getColor();
    }
}
