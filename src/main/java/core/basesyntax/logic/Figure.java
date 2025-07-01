package core.basesyntax.logic;

import core.basesyntax.Color;

public abstract class Figure implements AreaCalculator, PrintableFigure {
    protected Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
