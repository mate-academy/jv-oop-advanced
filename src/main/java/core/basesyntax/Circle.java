package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName().toLowerCase() + " area: "
                + getArea() + " sq.units, radius: " + radius + " units, color: " + getColor());
    }
}
