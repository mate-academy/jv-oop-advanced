package core.basesyntax;

public class Circle extends Figure {
    private final double radius;
    private final ColorSupplier color;

    public Circle(ColorSupplier color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + calculateArea() + "sq. units, radius: "
                + radius + " units, "
                + "color: " + color);
    }
}
