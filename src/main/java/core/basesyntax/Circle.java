package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    public Circle() {
        this.radius = new Random().nextInt(15);
    }

    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, radius: " + radius + ", area: "
                + getArea() + ", color: " + getColor());
    }
}
