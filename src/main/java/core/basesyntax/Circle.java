package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
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
                + radius + " units, color: " + getColor());
    }
}
