package core.basesyntax;

public class Circle extends Figure implements Drowable, CalculateArea {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This is circle with radius - " + this.radius
        + " and color - " + this.getColor());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
