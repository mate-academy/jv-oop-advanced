package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public  void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius
        + " units, color: " + getColor());
    }
}
