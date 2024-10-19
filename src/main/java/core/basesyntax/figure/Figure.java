package core.basesyntax.figure;

import core.basesyntax.figure.enums.Color;
import core.basesyntax.figure.interfaces.Drawable;

public abstract class Figure implements Drawable {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }
}
