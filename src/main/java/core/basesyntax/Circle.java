package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super();
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle," + "area: " + area() + "sq. units," + "radius: " + radius + "units, " + "color: " + color);
    }
}
