package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int length;
    private final int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public int calculateArea() {
        return length * width;
    }
}
