package core.basesyntax.model.figures;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
        setIdentification("circle");
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getIdentification() + ", area: "
                + area() + " sq. units, radius: " + getRadius() + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Figure getFigure() {
        return new Circle(Math.random() * 50);
    }
}
