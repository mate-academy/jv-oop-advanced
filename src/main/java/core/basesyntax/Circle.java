package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        this.area = areaCalculator();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double areaCalculator() {
        return this.area = 3.14 * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, radius: "
                + getRadius() + " units, color: "
                + getColor());
    }
}
