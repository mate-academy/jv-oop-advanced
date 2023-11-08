package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14159265359;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: "
                + getArea() + " sq. units, radius: "
                + radius + " units, PI: "
                + PI + " units, color: "
                + getColor().toLowerCase());
    }
}
