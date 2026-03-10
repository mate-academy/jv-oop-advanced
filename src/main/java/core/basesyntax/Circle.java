package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double size, String color) {
        super(color);
        this.radius = size;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea() + " sq. units, perimeter: "
                + getPerimeter() + " units, color: " + super.getColor());
    }
}
