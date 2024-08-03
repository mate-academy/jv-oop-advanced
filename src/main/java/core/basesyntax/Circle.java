package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color, String name) {
        this.radius = radius;
        setColor(color);
        setName(name);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public String toString() {
        return "Figure: " + getName() + ", area: " + getArea() + " sq. units"
                + ", radius: " + getRadius() + " units, color: " + getColor();
    }
}
