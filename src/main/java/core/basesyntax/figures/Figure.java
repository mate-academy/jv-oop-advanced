package core.basesyntax.figures;

import core.basesyntax.Interface.AreaCalculator;
import core.basesyntax.Interface.Drawable;

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
