package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super("circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea()
                + " sq.units, radius: " + radius + " units, color: " + color);
    }
}
