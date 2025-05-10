package core.basesyntax;

public class Circle extends Figure {
    private static final double ROUNDING_SCALE = 10.0;

    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + Math.round(getArea() * ROUNDING_SCALE) / ROUNDING_SCALE
                + " sq. units, radius: "
                + Math.round(radius * ROUNDING_SCALE) / ROUNDING_SCALE
                + " units, color: " + getColor().name());
    }
}
