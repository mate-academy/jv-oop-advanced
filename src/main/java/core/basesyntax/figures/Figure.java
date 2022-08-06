package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Info;

public abstract class Figure implements AreaCalculator, Info {
    private String figureName;
    private String color;

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
