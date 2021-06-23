package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getName() {
        return "Circle";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * (this.radius * this.radius);
    }

    @Override
    public String drawInfo() {
        return ("Figure: " + getName() + ", " + "area: " + area() + " sq.units, "
                + "radius: " + getRadius() + " units, " + "color: " + getColor());
    }
}
