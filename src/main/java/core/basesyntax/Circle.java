package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: " + areaCalculator()
                + " radius: " + radius + ", color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return Math.PI * radius * radius;
    }
}
