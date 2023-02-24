package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        super.color = color;
    }

    private double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
                + " units, color: " + super.color);
    }
}
