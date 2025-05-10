package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle," + " area: "
                + getArea() + " sq.units,"
                + " radius: " + radius + " units,"
                + " color: " + color);
    }
}
