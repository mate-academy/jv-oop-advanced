package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle...");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Color: " + color);
    }
    //formula p * r * r
}
