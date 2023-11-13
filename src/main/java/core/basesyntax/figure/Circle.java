package core.basesyntax.figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle{"
                + "area=" + calculateArea()
                + ", radius=" + radius
                + ", color=" + color
                + '}');
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
