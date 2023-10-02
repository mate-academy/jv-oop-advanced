package core.basesyntax.figures;

import core.basesyntax.color.Color;

public class Rectangle extends Figure {
    private int width;
    private int length;

    public Rectangle(Color color, int width, int length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return width * length;
    }

    @Override
    public void printInformation() {
        System.out.println("Figure: rectangle, area: " + calculateArea() + " sq.units, width: "
                + width + " units, length: " + length + " units, color: " + getColor());
    }
}
