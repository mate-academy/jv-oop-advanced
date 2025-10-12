package core.basesyntax;
import java.util.Locale;
class Circle extends Figure {
    private final double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
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
        System.out.println(String.format(Locale.US,
                "Figure: circle, area: %.2f sq. units, radius: %.1f units, color: %s",
                getArea(), radius, getColor()));
    }
}
