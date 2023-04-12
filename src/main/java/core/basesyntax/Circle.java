package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Circle: color=" + color + ", radius=" + radius + ", area=" + getArea());
    }
}
