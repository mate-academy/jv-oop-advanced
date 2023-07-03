package core.basesyntax.figures;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(Color color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, length: " + length + " units, width: " + width
                + " units, color: " + getColor().name());
    }
}
