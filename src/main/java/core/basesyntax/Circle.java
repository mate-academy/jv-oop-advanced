package core.basesyntax;

public class Circle extends Shape {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle , area : " + getArea(radius)
                + " radius : " + radius
                + ", color: " + getColor());
    }
}
