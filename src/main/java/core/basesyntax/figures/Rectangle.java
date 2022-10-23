package core.basesyntax.figures;

import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int width;
    private final int height;
    private final String name = "rectangle";

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure: "
                + name
                + ", area: "
                + getArea()
                + " sq.units, width: "
                + width
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }
}
