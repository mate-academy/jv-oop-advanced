package core.basesyntax.figures;

import core.basesyntax.AreaDeterminator;
import core.basesyntax.Color;
import core.basesyntax.Drawable;

public abstract class Figure implements Drawable, AreaDeterminator {
    private Color color;
    private String name;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getSimpleName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
