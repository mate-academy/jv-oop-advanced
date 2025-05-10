package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + " radius: " + getRadius() + " area: " + calculateArea()
                + " color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
