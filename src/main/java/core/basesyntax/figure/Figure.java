package core.basesyntax.figure;

import core.basesyntax.AreaCalculator;
import core.basesyntax.FigureDrawing;

public abstract class Figure implements AreaCalculator, FigureDrawing {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
