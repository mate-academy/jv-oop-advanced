package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final double length;
    private final double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public String showInfo() {
        return "Figure: Rectangle, area: " + length * width
                + " sq. units , length: " + length
                + " units , width: " + width + " units, color: " + color;
    }
}
