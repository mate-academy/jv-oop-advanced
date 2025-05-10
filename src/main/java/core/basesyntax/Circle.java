package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + getColor()
                + " circle with " + getRadius() + " units radius");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void getFigureData() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + getRadius()
                + " units, color: " + getColor());
    }
}
