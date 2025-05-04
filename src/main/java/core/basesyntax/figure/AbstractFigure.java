package core.basesyntax.figure;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.Figure;

public abstract class AbstractFigure implements Figure {
    protected Color color;

    public AbstractFigure(Color color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }
}
