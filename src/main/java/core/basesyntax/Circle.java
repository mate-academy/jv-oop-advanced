package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, String name, int radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, radius length: "
                + getRadius() + " units, color: "
                + getColor());
    }
}
