package core.basesyntax.Figures;

import core.basesyntax.Interfaces.AreaCalculator;
import core.basesyntax.Interfaces.Draw;

public abstract class Figure implements AreaCalculator, Draw {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

