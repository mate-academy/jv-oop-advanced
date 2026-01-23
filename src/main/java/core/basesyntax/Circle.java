package core.basesyntax;

public class Circle implements Behavior {
    private double radius;
    private String color;

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        double a = Math.PI * (radius * radius);
        return Math.round(a * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: " + radius +" units, color: " + color);
    }
}
