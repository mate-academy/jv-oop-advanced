package Figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle - Color: " + getColor()
                + ", Radius: " + radius
                + ", Area: " + calculateArea());
    }
}
