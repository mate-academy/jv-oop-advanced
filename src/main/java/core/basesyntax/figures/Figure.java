package core.basesyntax.figures;

import core.basesyntax.services.Drawable;
import core.basesyntax.services.Obtainable;

public abstract class Figure implements Drawable, Obtainable {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
