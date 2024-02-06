package core.basesyntax.figures;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + " radius: " + getRadius()
                + ", color: " + getColor());
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
