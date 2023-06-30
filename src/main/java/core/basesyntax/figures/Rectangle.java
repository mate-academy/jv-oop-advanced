package core.basesyntax.figures;

import core.basesyntax.colorSupplier.Color;

public class Rectangle extends Figure{
    private final int length;
    private final int height;

    public Rectangle(Color color, int length, int height) {
        super(color);
        this.length = length;
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: area - " + getArea()
                           + ", length - " + length
                           + ", height - " + height
                           + ", color - " + getColor().name()
                           + '.');
    }
}
