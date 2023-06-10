package core.basesyntax.shape;

import core.basesyntax.behaviour.Colorable;
import core.basesyntax.behaviour.Drawable;
import core.basesyntax.behaviour.Geometrical;
import core.basesyntax.type.Color;

public abstract class Shape
        implements Colorable, Geometrical, Drawable {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public String getStringColor() {
        return this.color.name().toLowerCase();
    }
}
