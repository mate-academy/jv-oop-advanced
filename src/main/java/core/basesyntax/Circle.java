package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle "
                + "area: "
                + getArea() + " sq.units, "
                + "radius: " + getRadius()
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area);
    }
}
