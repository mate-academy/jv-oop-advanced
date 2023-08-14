package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        toString();
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " sq.units, side: "
                + radius + " units, color: " + getColor();
    }
}
