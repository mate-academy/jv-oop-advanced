package core.basesyntax.figures;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Info;

public abstract class Figure implements AreaCalculator, Info {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
