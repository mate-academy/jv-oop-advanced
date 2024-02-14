package core.basesyntax.figure;

import core.basesyntax.Figure;

public class Circle extends Figure {
    private int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round(Math.PI * getRadius() * getRadius());
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", radius: " + getRadius() + " units");
    }
}
