package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String draw() {
        return "Figure: Circle, " + "square=" + getArea() + "sq.units, radius="
                + radius + "units, color=" + getColor() + '.';
    }
}
