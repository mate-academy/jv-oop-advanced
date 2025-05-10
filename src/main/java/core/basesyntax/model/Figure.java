package core.basesyntax.model;

import core.basesyntax.service.Area;
import core.basesyntax.service.Drawable;

public abstract class Figure implements Area, Drawable {
    private final String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
