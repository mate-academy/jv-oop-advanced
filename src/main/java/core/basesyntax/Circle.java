package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        this.radius = radius;
        setColor(color);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        double result = Math.pow(this.radius, 2) * Math.PI;
        return result;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + getArea() + " sq. units, radius: "
                + getRadius() + " units, color: " + getColor();
    }
}
