package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = Math.PI;
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void drawFigure() {
        double area = calculateArea();
        System.out.println("Figure: circle, area: " + area + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor());
    }

    public double getRadius() {
        return radius;
    }
}
