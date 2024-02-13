package core.basesyntax.figure;

import core.basesyntax.supplier.Color;
import core.basesyntax.supplier.Drawable;
import core.basesyntax.supplier.FigureArea;

public abstract class Figure implements FigureArea, Drawable {
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
