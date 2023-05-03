package core.basesyntax;

public class Circle extends Figure implements Drawable, Areable {

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
        System.out.println("Figure: Circle\nColor : " + getColor() + "\nRadius: " + radius);
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * radius * radius;
    }
}
