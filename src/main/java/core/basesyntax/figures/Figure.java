package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Color;
import core.basesyntax.InfoPrinter;

public abstract class Figure implements AreaCalculator, InfoPrinter {
    private final String name = getClass().getSimpleName();
    private Color color;

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
