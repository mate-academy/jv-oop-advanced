package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle"
                        + ", radius: " + getRadius() + " units"
                        + ", area: " + getArea() + " sq. units"
                        + ", perimeter: " + getPerimeter() + " units"
                        + ", diameter: " + getDiameter() + " units"
                        + ", color: " + color
        );

    }

    public double getDiameter() {
        return round(2 * radius);
    }

    public double getRadius() {
        return round(radius);
    }

    public double getArea() {
        return round(Math.PI * radius * radius);
    }

    public double getPerimeter() {
        return round(2 * Math.PI * radius);
    }
}
