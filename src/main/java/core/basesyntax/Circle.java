package core.basesyntax;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle\nColor : " + getColor()
                + "\nArea: " + getArea() + "\nRadius: " + radius);
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }
}
