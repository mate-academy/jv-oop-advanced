package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        this.radius = radius;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Circle{"
                + "area=" + getArea()
                + ", radius=" + radius
                + ", color=" + getColor().name() + '}';
    }
}
