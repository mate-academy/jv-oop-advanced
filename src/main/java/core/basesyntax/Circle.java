package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle,"
                        + " area: %.1f sq. units,"
                        + " radius: %.1f sq. units,"
                        + " color: %s\n",
                calculateArea(), radius, getColor());
    }
}
