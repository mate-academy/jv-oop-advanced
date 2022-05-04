package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + area() + " sq.units, "
                + "radius: " + radius + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
