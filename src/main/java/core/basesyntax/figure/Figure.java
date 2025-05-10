package core.basesyntax.figure;

import core.basesyntax.AreaCalculator;
import core.basesyntax.Drawer;

public abstract class Figure implements AreaCalculator, Drawer {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
