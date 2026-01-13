package core.basesyntax.figures;

import core.basesyntax.Interfaces.areaCalculator;
import core.basesyntax.Interfaces.draweble;

public abstract class Figure implements draweble, areaCalculator {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}