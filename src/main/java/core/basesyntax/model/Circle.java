package core.basesyntax.model;

import core.basesyntax.Drawable;
import core.basesyntax.FigureArea;

public class Circle implements Drawable, FigureArea {
    private String color;
    private double radius;

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }
}
