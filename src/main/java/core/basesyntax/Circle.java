package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + area()
                + "sq. units, radius: "
                + radius
                + " units, color: "
                + getColor();
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
