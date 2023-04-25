package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + calculateArea() + " sq.units, radius: " + radius
                + " units, color: "
                + getColor());
    }
}
