package org.denys.oop.advanced;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateFigureArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: "
                + calculateFigureArea()
                + ". The radius = "
                + getRadius()
                + ", the color is "
                + getColor());
    }

}
