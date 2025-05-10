package core.basesyntax.figures;

import core.basesyntax.services.AreaCalculator;
import core.basesyntax.services.Drawer;

public abstract class Figure implements AreaCalculator, Drawer {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
