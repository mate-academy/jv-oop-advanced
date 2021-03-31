package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private final String uniqueProperty;

    public Circle(String color, double radius) {
        super("circle", color);
        this.uniqueProperty = "radius";
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.2f sq. units, %s length: %.2f units, color: %s%n",
                uniqueProperty, calculateArea(), getName(),
                radius, getColor());
    }
}
