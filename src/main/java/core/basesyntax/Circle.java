package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius(int radius) {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Circle, area: " + findArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
