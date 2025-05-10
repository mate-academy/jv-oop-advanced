package core.basesyntax.figure;

import core.basesyntax.color.Color;

public class Rectangle extends Figure {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, double height, double width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public Rectangle(Color color, double height, double width) {
        this.color = color.name().toLowerCase();
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setSides(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void draw() {
        String str = "Figure: rectangle, area: " + getArea() + " sq.units, height: "
                + height + ", width: " + width + ", color: " + color;

        System.out.println(str);
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
