package core.basesyntax.figures;

import core.basesyntax.Figure;
import core.basesyntax.enums.Color;

public class Rectangle extends Figure {
    private final int length;
    private final int width;
    private final Color color;

    public Rectangle(int length, int width, Color color) {
        this.width = width;
        this.length = length;
        this.color = color;
    }

    @Override
    public String draw() {
        return "Figure: Rectangle" + ", area: " + area() + " sq. units"
                + ", length: " + length + " units, " + "sideDown: " + width + " units, "
                + "color: " + color;
    }

    @Override
    public double area() {
        return length * width;
    }
}
