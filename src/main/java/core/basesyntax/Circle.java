package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(Color.valueOf(color.toString()));
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, "
                + "area: " + getArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
