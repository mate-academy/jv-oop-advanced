package core.basesyntax.figure;

import core.basesyntax.Color;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width, Color color) {
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
        System.out.println("Figure: triangle{area: " + getArea() + " square units, " + "length = "
                + length + ", width = " + width + ", color = " + getColor() + '}');
    }
}
