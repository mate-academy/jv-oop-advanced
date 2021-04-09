package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + Math.round(getArea())
                + " sq. units, radius: "
                + Math.round(getRadius())
                + " units, color: " + getColor();
    }
}
