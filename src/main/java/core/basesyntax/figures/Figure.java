package core.basesyntax.figures;

import core.basesyntax.interfaces.AreaCalculable;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements Drawable, AreaCalculable {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
