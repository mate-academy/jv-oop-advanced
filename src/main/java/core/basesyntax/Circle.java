package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * ROUNDING_PRECISION) / ROUNDING_PRECISION;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + getArea() + " units, radius: "
                + radius + " color: " + getColor());
    }
}
