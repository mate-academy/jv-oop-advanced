package model;

public class Circle extends Figure implements Area, Draw {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawing() {
        System.out.println("Circle radius: " + radius
                + ", area: " + getArea()
                + ", color: " + getColor());
    }
}
