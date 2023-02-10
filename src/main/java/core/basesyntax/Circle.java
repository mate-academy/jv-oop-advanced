package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: circle, area: %.1f sq.units, radius: %.1f units, color: %s",
                area(), radius, color.toLowerCase());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
