package core.basesyntax.shape;

import core.basesyntax.behaviour.Drawable;
import core.basesyntax.behaviour.Geometrical;
import core.basesyntax.type.Color;

public abstract class Shape
        implements Geometrical, Drawable {
    public static final byte SHAPES_COUNT = 5;

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }
}
