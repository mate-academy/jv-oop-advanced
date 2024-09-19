package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("Gometric value need to be greater than zero");
        } else {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: " + getArea() + " sq. units"
                        + ", radius: " + radius + " units"
                        + ", color: " + getColor());
    }
}
