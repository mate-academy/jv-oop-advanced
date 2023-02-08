package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        super.color = color;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + this.area()
                + " sq.units, radius: " + getRadius() + " units, color: " + getColor());
    }

    public double getRadius() {
        return radius;
    }
}

