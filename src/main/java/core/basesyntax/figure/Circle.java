package core.basesyntax.figure;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Figure {

    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * pow(radius, 2);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", radius: " + radius;
    }
}
