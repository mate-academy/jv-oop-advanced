package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + calculateArea() + " sq.units, radius: "
                + radius + " units, color: " + getColor().name().toLowerCase());
    }
}
