package core.basesyntax;

import core.basesyntax.behavior.AreaCalculator;
import core.basesyntax.behavior.Draw;

public abstract class Figure implements Draw, AreaCalculator {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
