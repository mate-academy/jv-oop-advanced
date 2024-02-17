package core.basesyntax.figure;

import core.basesyntax.common.Drawable;
import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureType;

public abstract class Figure implements Drawable {
    private FigureType type;
    private Color color;

    public Figure(FigureType type, Color color) {
        this.type = type;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public FigureType getType() {
        return type;
    }

    public abstract double getArea();
}
