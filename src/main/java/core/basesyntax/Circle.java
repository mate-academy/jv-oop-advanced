package core.basesyntax;

public class Circle extends Figure implements AreaCalculator {
    private static final double PI = Math.PI;
    private final double radius;

    public Circle(String color, double rad) {
        super(color);
        double r = rad;
        this.radius = r;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: circle, area: %.2f sq. units,"
                + " radius: %.2f units, color: %s", getArea(), radius, getColor()));
    }
}
