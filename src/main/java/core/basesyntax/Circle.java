package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
    return PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq.units, radius: " + radius + " units, color: " + super.color);
    }
}
