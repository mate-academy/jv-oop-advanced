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
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void printInfo() {
        System.out.println(getColor() + " circle with radius: " + getRadius()
                + " and area: " + getArea() + " ПУТІН ХУЙЛО");
    }
}
