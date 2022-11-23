package core.basesyntax.models;

import core.basesyntax.service.areaCalculator;
import core.basesyntax.service.drawable;

public abstract class Figure implements drawable, areaCalculator {
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
