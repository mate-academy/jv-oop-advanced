package core.basesyntax;

import static java.lang.Math.PI;

public class Circle extends Figure {
    private int radius;

    public Circle(String color, int radius) {
        super(String.valueOf(color));
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle = {" + "color: " + getColor()
                + ", radius: " + getRadius()
                + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
