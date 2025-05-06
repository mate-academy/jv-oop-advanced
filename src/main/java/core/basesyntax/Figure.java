package core.basesyntax;

import core.basesyntax.interfaces.AreaCounter;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCounter {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
