package core.basesyntax.figures;

import core.basesyntax.util.AreaProvider;
import core.basesyntax.util.Color;
import core.basesyntax.util.Drawable;

public abstract class Figure implements AreaProvider, Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
