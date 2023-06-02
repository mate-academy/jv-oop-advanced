package core.basesyntax.figure;

import core.basesyntax.enumforfigure.Color;
import core.basesyntax.enumforfigure.FigureType;
import core.basesyntax.interfaceforfigure.Drawable;
import core.basesyntax.interfaceforfigure.HavingArea;

public abstract class Figure implements HavingArea, Drawable {
    protected Color color;
    protected FigureType figureType;

    public Figure(Color color, FigureType figureType) {
        this.color = color;
        this.figureType = figureType;
    }
}
