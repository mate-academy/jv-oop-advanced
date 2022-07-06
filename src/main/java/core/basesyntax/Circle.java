package core.basesyntax;

public class Circle extends Figure {

    private int radius;

    public Circle() {

    }

    public Circle(int radius, String name, String color) {
        this.radius = radius;
        setName(name);
        setColor(color);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + " area: " + area() + " sq.units, radius: " + radius
                + " units, color: " + getColor());
    }
}
