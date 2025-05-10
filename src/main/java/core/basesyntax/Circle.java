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
        System.out.println(String.format("Circle with area: %.2f sq. units, radius: %.2f units, "
                + "color: %s", getArea(), getRadius(), getColor()));
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
