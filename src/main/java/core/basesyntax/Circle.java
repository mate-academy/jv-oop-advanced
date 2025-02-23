package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
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
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + super.getName() + ", area: " + area() + " sq. units, "
                           + "radius: " + radius + " units, color: " + super.getColor());
    }
}
