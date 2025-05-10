package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: "
                + getArea()
                + " sq. units, radius: "
                + radius
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return radius * radius * PI;
    }
}
