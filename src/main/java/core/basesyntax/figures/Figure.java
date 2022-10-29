package core.basesyntax.figures;

import core.basesyntax.AreaDeterminator;
import core.basesyntax.Color;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable, AreaDeterminator {
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
