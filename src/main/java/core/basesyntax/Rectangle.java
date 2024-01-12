package org.example;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(Color color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Shape: rectangle, area: " + area() + "sq. units, length: " + length
                + "sq. units, width: " + width + "sq. units, color: " + getColor());
    }
}
