package core.basesyntax;

import core.basesyntax.interfaces.AreaCalculator;
import core.basesyntax.interfaces.DrawFigure;

public abstract class Figure implements AreaCalculator, DrawFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
