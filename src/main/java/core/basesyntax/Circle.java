package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color, FigureType.CIRCLE);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType() + ", area: " + String.format("%.2f", area())
                + " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }
}
