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
    public String toString() {
        return "Figure: circle " + "area: "
                + getArea() + " sq.units, "
                + "radius: " + radius
                + " color: " + getColor();
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return Math.round(area * 100) / 100;
    }
}
