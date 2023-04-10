package core.basesyntax;

public class Circle implements Figure{

    private double radius;

    private String color;


    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + " sq.units, radius: " + radius + " units, color: " + color);
    }
}
