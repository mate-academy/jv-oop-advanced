package core.basesyntax;

import core.basesyntax.behavior.Area;
import core.basesyntax.behavior.Drawable;
import core.basesyntax.model.Color;
import core.basesyntax.model.FigureType;

public abstract class Figure implements Area, Drawable {
    protected FigureType type;
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public String getNameByType() {
        return type.name().toLowerCase().replaceAll("_", " ");
    }

    public String getStringColor() {
        return color.name().toLowerCase();
    }
}
