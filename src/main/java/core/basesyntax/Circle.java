package core.basesyntax;

public class Circle extends Figure{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("This figure is circle: color " + color + ", radius: " + roundToTwoDecimals(radius)
                + ", area:" + roundToTwoDecimals(getArea()) + ".");
    }
}
