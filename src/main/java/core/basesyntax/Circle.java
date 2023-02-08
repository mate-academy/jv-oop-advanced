package core.basesyntax;

public class Circle extends Figure {

    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "Circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + "units, "
                + "color: " + getColor());

    }
}
