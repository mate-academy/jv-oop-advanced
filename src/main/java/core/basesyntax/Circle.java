package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, String name, int radius) {
        super(color, name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + "," + " area:" + getArea()
                + " sq. units, radius length: " + radius + " units, color: " + getColor());
    }

    @Override
    public String toString() {
        return "Circle{"
                + "radius=" + radius
                + '}';
    }
}
