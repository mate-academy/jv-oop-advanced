package core.basesyntax.abstracts;

import core.basesyntax.colosuply.Color;
import core.basesyntax.interfaces.AreaDefinition;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaDefinition {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
