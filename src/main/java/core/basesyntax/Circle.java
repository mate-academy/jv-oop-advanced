package core.basesyntax;

import java.awt.*;

public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String draw() {
        return null;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
