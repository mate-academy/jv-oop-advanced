package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double obtainArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + obtainArea()
                + " sq. units, radius: " + radius + ", color: " + getColor());
    }
}
