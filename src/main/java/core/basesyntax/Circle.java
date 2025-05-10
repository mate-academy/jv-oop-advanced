package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (2 * radius);
    }

    @Override
    public String draw() {
        return "Circle Color: " + getColor() + " - Radius: " + getArea();
    }
}
