package core.basesyntax.model;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public int calculateArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area: "
                + calculateArea()
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor());
    }
}
