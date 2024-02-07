package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, "
                + "area: " + calculateArea() + " sq.units "
                + "radius: " + radius + " units "
                + "color: " + getColor().name().toLowerCase();
    }

    @Override
    public double calculateArea() {
        return (int)(Math.PI * radius * radius * 1000) / 1000.0;
    }
}
