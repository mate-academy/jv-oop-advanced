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
                        + ", area: " + calculateArea() + " sq. units"
                        + ", color: " + color
        );
    }

    public double getRadius() {
        return round(radius);
    }

    public double calculateArea() {
        return round(Math.PI * radius * radius);
    }

}
