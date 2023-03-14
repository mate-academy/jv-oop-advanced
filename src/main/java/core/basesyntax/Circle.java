package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(Color colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.println("Circle with radius " + radius + " and colour " + getColor());
    }
}
