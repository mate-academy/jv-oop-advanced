package core.basesyntax.figures;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;
import core.basesyntax.interfaces.Drawable;
import core.basesyntax.interfaces.HavingArea;

public abstract class Figure implements HavingArea, Drawable {
    protected Color color;
    protected FigureType figureType;
}
