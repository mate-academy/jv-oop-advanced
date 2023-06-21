package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String info() {
        return "Figure: circle, area: " + area() + " sq.units, radius: "
                + radius + " units, color: " + getColor().name().toLowerCase();
    }
}
