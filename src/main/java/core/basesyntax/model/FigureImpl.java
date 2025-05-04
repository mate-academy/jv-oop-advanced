package core.basesyntax.model;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.Figure;

public abstract class FigureImpl implements Figure {
    private final Color color;

    public FigureImpl(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }
}
