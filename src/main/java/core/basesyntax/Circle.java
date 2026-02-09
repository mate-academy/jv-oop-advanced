package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Drawable {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            return;
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.getRadius() * this.getRadius();
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + this.area() + " sq. units, radius: "
                + this.getRadius() + ", color: "
                + getColor());
    }

}
