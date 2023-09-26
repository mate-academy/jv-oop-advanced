package core.basesyntax.figures;

import core.basesyntax.color.Color;

public abstract class Figure implements IPrintable, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
