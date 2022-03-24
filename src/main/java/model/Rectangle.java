package model;

public class Rectangle extends Figure {
    private double width;
    private double length;

    public Rectangle(String color, double width, double length) {
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
        System.out.println("Rectangle length: " + length
                + ", wight: " + width
                + ", area: " + area()
                + ", color: " + getColor());
    }
}
