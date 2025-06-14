package core.basesyntax.figures;

import core.basesyntax.interfaces.Drawable;
import core.basesyntax.interfaces.Measurable;

public abstract class Figure implements Drawable, Measurable {
    private String color;

    Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
