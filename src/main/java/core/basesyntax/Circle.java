package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private double area;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color, double radius, double area) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        area = radius * radius * Math.PI;
        return area;
    }

    @Override
    public String toString() {
        return "Figure: Circle, "
                + "radius: " + radius
                + " units, area: " + area
                + " sq.units: "
                + "color: " + getColor();
    }
}
