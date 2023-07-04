package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + findArea()
                + " sq.units, radius: " + this.radius
                + " units, color: " + getColor());
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
