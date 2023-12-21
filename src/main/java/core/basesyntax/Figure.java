package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.enums.FigureName;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private Color color;
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

    public void setColor() {
        this.color = new ColorSupplier().getRandomColor();
    }
}
