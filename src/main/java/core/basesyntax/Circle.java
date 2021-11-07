package core.basesyntax;

public class Circle extends Figure implements Drawing, AreaCalculator {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: circle, area: "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
