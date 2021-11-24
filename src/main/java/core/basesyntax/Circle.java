package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String drawing() {
        return " Figure: circle, area: " + getFigureArea() + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor();
    }
}
