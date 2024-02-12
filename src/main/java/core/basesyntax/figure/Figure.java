package core.basesyntax.figure;

import core.basesyntax.supplier.Color;
import core.basesyntax.supplier.FigureArea;

public abstract class Figure implements FigureArea {
    private Color color;

    public abstract String draw();
}

