package core.basesyntax.figures;

import core.basesyntax.interfaces.Computed;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, Computed {
    private final String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
