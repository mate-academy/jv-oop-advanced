package core.basesyntax.figures;

import core.basesyntax.Figure;

public abstract class AbstractFigure implements Figure {
    @Override
    public abstract String getSize();

    @Override
    public String color() {
        return "white";
    }

    @Override
    public abstract double area();
}
