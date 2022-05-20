package core.basesyntax.model;

import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Draw;

public abstract class Figure implements AreaCalculator, Draw {
    private String color;

    protected Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
