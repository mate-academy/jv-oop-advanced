package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    private static final double pi = 3.14;
    Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {

        return pi*radius*radius;
    }
    @Override
    public String getSpecificProperties() {
        return "radius: " + radius;
    }
}
