package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
