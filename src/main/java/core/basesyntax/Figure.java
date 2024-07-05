package core.basesyntax;

import core.basesyntax.interfase.figure.AreaCalculator;
import core.basesyntax.interfase.figure.DrawFigure;

public abstract class Figure implements AreaCalculator, DrawFigure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
