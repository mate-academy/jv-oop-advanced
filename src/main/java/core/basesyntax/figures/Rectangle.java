package core.basesyntax.figures;

import core.basesyntax.state.Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq. cm, length: %d cm, width: %d cm, "
                + "color: %s\n", getName(), getArea(), length, width, getColor());
    }
}
