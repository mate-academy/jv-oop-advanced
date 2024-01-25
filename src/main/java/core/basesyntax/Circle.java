package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("This is " + super.getColor().toLowerCase() + " circle with radius of "
                + getRadius() + " and area of " + getArea());
    }
}
