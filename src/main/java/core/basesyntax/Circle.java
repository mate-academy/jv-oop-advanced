package core.basesyntax;

public class Circle {
    private String color;
    private double radius;
    private final double area = Math.PI * radius * radius;
    public Circle() {
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + area + " sq.units," +
                " radius: " + radius + " units," +
                " color: " + color);
    }
}
