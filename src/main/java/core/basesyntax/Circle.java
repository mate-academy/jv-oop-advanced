package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.setRadius(radius);
    }

    @Override
    public double area() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: " + getName() + ", area: " + area()
                + "units, side: " + getRadius() + " units, color: " + getColor();
    }
}
