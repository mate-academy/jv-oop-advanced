package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.Figure;

public class Rectangle extends Figure {
    private final int height;
    private final int width;

    public Rectangle(int height, int width, Color color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double countArea() {
        return height * width;
    }

    @Override
    public String showInformation() {
        return String.format("Figure: rectangle, area: %f sq. units, height: %d units, width: %d units, color: %s", countArea(), height, width, color.name().toLowerCase());
    }
}
