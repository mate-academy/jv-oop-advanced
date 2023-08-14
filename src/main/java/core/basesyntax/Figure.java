package core.basesyntax;

import core.basesyntax.interfaces.Drawable;
import core.basesyntax.interfaces.Shape;

public abstract class Figure implements Shape, Drawable {
    protected String color;

    protected Figure(String color) {
        this.color = color;
    }
}
