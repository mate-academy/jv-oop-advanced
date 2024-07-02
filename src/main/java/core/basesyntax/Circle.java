package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return Math.round(area);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle,"
                + " area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
