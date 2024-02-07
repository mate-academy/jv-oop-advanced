package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, Color: " + getColor()
                + ", Radius: " + radius + ", Area: " + getArea());
    }
}
