package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Type = Circle, radius = "
                + radius + ", area = "
                + getArea() + ", color = " + super.getColor());
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
