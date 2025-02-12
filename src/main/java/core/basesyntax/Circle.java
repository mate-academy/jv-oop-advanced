package core.basesyntax;

import java.lang.Math;

public class Circle extends Figure implements Interface {
    private final double radius;
    private final String name = "circle";

    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getArea() {
        return (Math.round(Math.PI * radius * radius) * 10.0) / 10.0;
    }

    public void draw() {
        System.out.println("Figure: " + name + ", area: " + getArea() + " sq. units, radius: " + radius +
                " units, color: " + color);
    }
}
