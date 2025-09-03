package core.basesyntax.model;

import core.basesyntax.Drawable;
import core.basesyntax.FigureArea;

public class Rectangle implements Drawable, FigureArea {
    private String color;
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + getArea() + " sq. units, width: " + width
                + " units, height: " + height + " units, color: " + color);
    }
}
