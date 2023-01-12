package core.basesyntax.model;

import core.basesyntax.service.AreaCalculator;
import core.basesyntax.service.Painter;

public abstract class Figure implements AreaCalculator, Painter {
    private String color;

    public Figure() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
