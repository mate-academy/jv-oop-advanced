package core.basesyntax;

import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.setShape("Circle");
        this.setColor(color);
        this.radius = radius;
    }

    public Circle() {
        this.radius = new Random().nextInt(100);
        this.setShape("Circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: %s , area: %s sq.units, radius: %s units, color: %s%n",
                getShape(), getArea(), getRadius(), getColor());
    }
}
