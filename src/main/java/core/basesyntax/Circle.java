package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
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
    public double calculateArea() {
        return 2 * Math.PI * (radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: Circle, "
                + "area: " + calculateArea() + " sq. units, "
                + "radius: " + getRadius() + " units, "
                + "color: " + this.getColor();
    }
}
