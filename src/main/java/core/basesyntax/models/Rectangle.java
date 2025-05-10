package core.basesyntax.models;

import core.basesyntax.Figure;

public class Rectangle implements Figure {
    private final String color;
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
     public void draw() {
        System.out.println("Color: " + color
                + "Type: Rectangle "
                + "Width: " + width
                + "Height: " + height);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
