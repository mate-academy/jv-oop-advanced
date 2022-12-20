package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return width * height;
    }

    @Override
    public void draw() {
        String square = String.format("%.1f", square());
        System.out.println("Figure: rectangle, area: " + square + " sq.units, width: " + width + ", height: " + height + ", color: " + super.getColor());
    }
}
