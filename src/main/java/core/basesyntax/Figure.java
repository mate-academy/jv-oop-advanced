package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.interfaces.FigureArea;
import core.basesyntax.interfaces.FigureDrawer;

public abstract class Figure implements FigureArea, FigureDrawer {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
