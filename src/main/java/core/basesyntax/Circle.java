package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        setColor(color);
        this.radius = radius;
    }

    public Circle(String color, int radius, String name) {
        setName(name);
        setColor(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: circle, color: "
                + getColor() + " radius: " + radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
