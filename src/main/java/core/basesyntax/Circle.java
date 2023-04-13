package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, Colors color) {
        super(Math.PI * radius * radius, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + getArea() + " sq.units, side: "
                + getRadius() + " units, color: "
                + getColor().name().toLowerCase());
    }

    private int getRadius() {
        return radius;
    }
}
