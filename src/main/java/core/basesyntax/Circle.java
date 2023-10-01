package core.basesyntax;

public class Circle extends Figure {
    private Color color;
    private double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.println("Figure: Circle "
                + " area " + getArea() + " sq.units,"
                + " side " + radius + " units"
                + " color " + color);
    }
}
