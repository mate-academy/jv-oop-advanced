package core.basesyntax;

public class Circle implements AreaCalculable, Drawable {
    private final String color;
    private final double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: circle, area: %.2f sq. units, radius: %.2f units, color: %s%n",
                getArea(), radius, color
        );
    }
}
