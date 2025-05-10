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
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getTypeName() + ", area: "
                + String.format("%.2f", getArea())
                + " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }
}
