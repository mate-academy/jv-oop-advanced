package core.basesyntax;

public class Circle extends Figure {
    private Color color;
    private double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle "
                + " area " + calculateArea() + " sq.units,"
                + " side " + radius + " units"
                + " color " + color);
    }
}
