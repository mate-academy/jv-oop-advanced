package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return PI * (radius * radius);
    }

    public String printInfo() {
        return "Figure: circle, "
             + "area: " + this.getArea() + " sq.units, "
             + "radius: " + radius + " units, "
             + "color: " + this.getColor();
    }
}
