package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double caclulateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + caclulateArea()
                + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
