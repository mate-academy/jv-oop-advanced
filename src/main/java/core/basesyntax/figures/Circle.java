package core.basesyntax.figures;

import core.basesyntax.ColorSupplier;

import java.util.Random;

public class Circle extends Figure{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
        super(new ColorSupplier().getRandomColor());
        this.radius = new Random().nextInt(9)+1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * 3.14 * radius;
    }

    @Override
    public void draw() {
        String sb = "Figure: Circle, Color: " + getColor() + ", Radius: " + getRadius() + ", Area: " + getArea();

        System.out.println(sb);
    }
}
