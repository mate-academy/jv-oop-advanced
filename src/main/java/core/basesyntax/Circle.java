package core.basesyntax;

public class Circle implements Figure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println(getArea());
    }

    @Override
    public String getColor() {
        return color;
    }
}
