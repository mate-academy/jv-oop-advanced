package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private static final double ROUNDING_FACTOR = 10.0;
    private double width;
    private double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = round(width);
        this.height = round(height);
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
                + " units, color: " + getColor());
    }

    private double round(double value) {
        return Math.round(value * ROUNDING_FACTOR) / ROUNDING_FACTOR;
    }
}
