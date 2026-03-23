package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be > 0");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String areaStr = format(getArea());
        String radiusStr = format(radius);
        System.out.printf("Figure: circle, area: %s sq. units, radius: %s units, color: %s%n",
                areaStr, radiusStr, color.toLowerCase());

    }
}
