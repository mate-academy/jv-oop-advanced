package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + String.format("%(.1f", getArea())
                + " sq.units, radius: " + radius
                + " units, color: " + getColor();
    }
}
