package core.basesyntax;

import core.basesyntax.interfaces.FigureArea;
import core.basesyntax.interfaces.FigureDraw;

public abstract class Figure implements FigureArea, FigureDraw {
    private Colors color;

    public void setColor(Colors color) {
        this.color = color;
    }

    public String getColor() {
        return color.name();
    }
}
