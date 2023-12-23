package core.basesyntax;

import core.basesyntax.enums.FigureName;
import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.Drawable;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private FigureName figureName;

    public void setFigureName(FigureName figureName) {
        this.figureName = figureName;
    }

    public FigureName getFigureName() {
        return figureName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
