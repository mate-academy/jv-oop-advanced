package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.DrawingFigure;

public abstract class Figure implements AreaCalculator, DrawingFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
