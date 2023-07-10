package core.basesyntax.figure;

import core.basesyntax.tools.Color;

public class Rectangle extends Figure {
    private int length;
    private int width;

    public Rectangle(String name, Color color, int length, int width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double resultArea() {
        return length * width;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(" area: " + resultArea() + " sq.units"
                + ", length: " + length + " units, "
                + "width: " + width + " units, "
                + "color: " + getColor().name());
    }
}
