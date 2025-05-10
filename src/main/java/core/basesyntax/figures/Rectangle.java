package core.basesyntax.figures;

import core.basesyntax.model.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: rectangle, area: %.1f sq.units, "
                + "length: %.1f units, width: %.1f units, color: %s%n",
                calculateArea(), this.getLength(), this.getWidth(), this.getColor());
    }
}
