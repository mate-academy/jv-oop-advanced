package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + " radius: " + radius
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
