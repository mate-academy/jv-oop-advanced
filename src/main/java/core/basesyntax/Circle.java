package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * Math.pow(radius, 2));
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "circle" + ", area: " + calculateArea()
                + ", radius: " + radius + ", color: " + getColor());
    }
}
