package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String end = " sq.units, radius: " + radius + " units, color: " + getColor();
        System.out.println("Figure: circle, area: " + getArea() + end);
    }
}
