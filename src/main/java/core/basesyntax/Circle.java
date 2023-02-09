package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + String.format("%.2f", area())
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor().name());
    }
}
