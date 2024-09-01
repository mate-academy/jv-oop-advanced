package core.basesyntax;

public class Circle extends Figure {

    private String name = "Circle";

    private String color;
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String printAllInformation() {
        return "Figure" + ": " + name + ", area: " + findArea() +
                " sq. units, radius: " + getRadius() + ", color: " + getColor();
    }
}
