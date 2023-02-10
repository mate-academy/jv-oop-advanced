package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        String message = "Figure: circle, area: " + getArea()
                + " sq.units, radius: " + getRadius()
                + " units, color: " + getColor();
        System.out.println(message);
    }
}
