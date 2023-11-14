package core.basesyntax;

import java.util.Random;

public class Circle extends Figure implements FigureInfo {
    private final double radius;

    public Circle(double radius,String color) {
        super(color);
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + " " + "Circle" + " " + "radius" + " " + radius + " " + "Area" + " " + getArea() + " ");


    }
}
