package core.basesyntax;

public class Circle extends Figure {
    double radius;

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
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Circle - Color: " + getColor()
                + ", Radius: " + radius
                + ", Area: " + getArea());;
    }
}
