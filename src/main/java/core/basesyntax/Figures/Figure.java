package core.basesyntax.Figures;

import core.basesyntax.Interfaces.AreaCalculator;
import core.basesyntax.Interfaces.Draweble;

public abstract class Figure implements Draweble, AreaCalculator {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}