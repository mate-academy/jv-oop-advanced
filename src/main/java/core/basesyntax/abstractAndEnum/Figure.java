package core.basesyntax.abstractAndEnum;

import core.basesyntax.interfaceServices.AreaCalculator;
import core.basesyntax.interfaceServices.Drawable;

public abstract class Figure implements Drawable, AreaCalculator {
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
