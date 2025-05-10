package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double obtainArea() {
        return Math.ceil(Math.PI * Math.pow(radius, 2));
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                          + "color: " + getColor() + ", "
                          + "radius: " + getRadius() + " " + "units, "
                          + "area: " + obtainArea() + " " + "sq.units");

    }
}
