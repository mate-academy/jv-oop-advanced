package core.basesyntax;

public class Circle extends Figure {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
