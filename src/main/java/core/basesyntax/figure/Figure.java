package core.basesyntax.figure;

import core.basesyntax.Color;
import core.basesyntax.behaviour.CalculateArea;
import core.basesyntax.behaviour.DrawFigure;

public abstract class Figure implements CalculateArea, DrawFigure {
    private final Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}
