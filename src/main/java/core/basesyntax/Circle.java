package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double area, double radius, String color) {
        super(name, area, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", "
                + "area: " + getArea() + ", " + "radius: "
                + getRadius() + ", " + "color: " + getColor());
    }
}
