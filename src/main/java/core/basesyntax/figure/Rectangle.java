package core.basesyntax.figure;

import core.basesyntax.figure.Figure;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " square units, width: " + width
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
