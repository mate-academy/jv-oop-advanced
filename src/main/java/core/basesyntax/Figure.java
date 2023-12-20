package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureName;
import core.basesyntax.interfaces.Area;
import core.basesyntax.interfaces.Draw;

public abstract class Figure implements Area, Draw {
    private Color color = new ColorSupplier().getRandomColor();
    private FigureName figureName;

    public void setFigureName(FigureName figureName) {
        this.figureName = figureName;
    }

    public FigureName getFigureName() {
        return figureName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
