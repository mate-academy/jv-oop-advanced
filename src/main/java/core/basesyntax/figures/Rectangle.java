package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private double width;
    private double height;
    private String color;

    public Rectangle(double width, double height, String color) {
        this.width = round(width);
        this.height = round(height);
        this.color = color;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + " units, height: " + height
                + " units, color: " + color);
    }

    private double round(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}
