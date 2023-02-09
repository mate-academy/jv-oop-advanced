package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        super(Color.WHITE.name());
        this.radius = 10;
    }

    public Circle(double radius) {
        super();
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
