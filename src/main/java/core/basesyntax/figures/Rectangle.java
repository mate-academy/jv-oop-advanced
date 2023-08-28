package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq.units, length: " + length + " units, width "
                + width + " units, color: " + getColor());
    }

}
