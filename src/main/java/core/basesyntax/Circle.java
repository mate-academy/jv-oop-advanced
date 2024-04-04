package core.basesyntax;

public class Circle implements Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("core.basesyntax.Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }
}
