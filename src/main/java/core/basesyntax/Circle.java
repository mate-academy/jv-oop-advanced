package core.basesyntax;

public class Circle extends Figure {
    private final String color;
    private final double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * (radius * radius);
        return area;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle," + " area: " + getArea() + " sq. units,"
                + " radius: " + radius + " units, " + "color: " + getColor());

    }
}
