package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf(
                "Figure: circle; Radius: %.2f, Area: %.2f; Color: %s\n",
                radius, getArea(), getColor()
        );
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
