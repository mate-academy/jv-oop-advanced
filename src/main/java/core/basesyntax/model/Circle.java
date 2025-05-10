package core.basesyntax.model;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void set(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getClass().getSimpleName() + ", square: "
                + getArea() + " sq. units, color: " + getColor() + ", radius: "
                + getRadius());
    }
}
