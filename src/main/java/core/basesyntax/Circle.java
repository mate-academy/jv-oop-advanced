package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(DiffColor color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void toDraw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq.units, radius: " + radius
                + " units, color: " + getColor().name().toLowerCase());
    }
}
