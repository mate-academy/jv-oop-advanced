package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("This " + getColor() + " circle has radius " + radius
                + " and area " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
