package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String draw() {
        return "Figure: Circle, "
                + "radius: " + radius
                + " units, area: " + findArea()
                + " sq.units: "
                + "color: " + getColor();
    }
}
