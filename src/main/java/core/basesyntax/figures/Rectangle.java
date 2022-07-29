package core.basesyntax.figures;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(Color color, int width, int height) {
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
        return "Figure: rectangle, area: " + getArea() + " sq.units, width: "
                + width + " units, height: " + height + " units, color: " + getColor();
    }
}
