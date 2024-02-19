package core.basesyntax.figure;

import core.basesyntax.supplier.AreaCalculator;
import core.basesyntax.supplier.Color;
import core.basesyntax.supplier.FigureDraw;

public abstract class Figure implements FigureDraw, AreaCalculator {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
