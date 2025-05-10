package core.basesyntax;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(Colors.valueOf(color));
        this.radius = Math.round(Math.abs(radius));
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Shape: circle, area: " + calculateArea()
                + ", radius: " + getRadius()
                + ", color: " + getColor());
    }
}
