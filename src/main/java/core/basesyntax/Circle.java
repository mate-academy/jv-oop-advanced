package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("All dimensions must be positive");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.area() + " sq. units, radius: "
                + this.radius + ", color: "
                + getColor());
    }

}
