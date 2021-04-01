import core.basesyntax.Figure;

public class Circle extends Figure {
    private final double radius;

    public Circle(int radius, String color) {
        super(color, "circle");
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units"
                + ", radius: " + radius + " units, color: " + getColor();
    }
}
