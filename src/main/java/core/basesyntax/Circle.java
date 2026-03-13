package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color, calculateArea(radius), "Circle");
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, radius: " + getRadius() + " units, color: " + getColor());
    }

    private static double calculateArea(int radius) {
        return Math.pow(radius, 2) * Math.PI;
    }

    public int getRadius() {
        return radius;
    }
}
